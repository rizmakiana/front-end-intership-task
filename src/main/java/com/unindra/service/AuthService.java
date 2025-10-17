/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unindra.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.unindra.model.request.LoginRequest;
import com.unindra.model.response.TokenResponse;
import com.unindra.model.response.WebResponse;
import com.unindra.util.AppManager;
import java.io.IOException;
import java.util.Map;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 *
 * @author rizmakiana
 */
public class AuthService {
    
    private final ObjectMapper om = new ObjectMapper();
    private final OkHttpClient client = new OkHttpClient();
    
    public String loginStaff(LoginRequest request) throws IOException {
        String jsonRequest = om.writeValueAsString(request);

        RequestBody requestBody = RequestBody.create(jsonRequest, MediaType.parse("application/json"));
        Request requestHttp = new Request.Builder()
                .url(AppManager.getWebName() + "/api/auth/login")
                .post(requestBody)
                .build();

        try (Response response = client.newCall(requestHttp).execute()) {

            String jsonResponse = response.body().string();

            WebResponse<TokenResponse> webResponse = om.readValue(
                    jsonResponse, new TypeReference<WebResponse<TokenResponse>>() {}
            );

            Object errors = webResponse.getErrors();
            if (errors != null) {
                if (errors instanceof Map) {
                    Map<String, String> map = (Map<String, String>) errors;
                    String firstError = map.values().stream().findFirst().orElse("Unknown error");
                    throw new IOException(firstError);
                }
                if (errors instanceof String) {
                    throw new IOException((String) errors);
                }
                throw new IOException(errors.toString()); // fallback
            }

            TokenResponse tokenResponse = webResponse.getData();
            if (tokenResponse == null) {
                throw new IOException("Login gagal: tidak ada token dari server");
            }

            AppManager.setToken(tokenResponse); // simpan ke AppManager
            return webResponse.getMessage();
        }
    }
    
}
