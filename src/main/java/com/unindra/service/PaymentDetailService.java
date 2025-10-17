package com.unindra.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.unindra.model.request.PaymentDetailRequest;
import com.unindra.model.request.PaymentDetailUpdate;
import com.unindra.model.response.PaymentDetailResponse;
import com.unindra.model.response.WebResponse;
import com.unindra.util.AppManager;
import java.io.IOException;
import java.util.List;
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
public class PaymentDetailService {
    
    private final ObjectMapper om = new ObjectMapper();
    private final OkHttpClient client = new OkHttpClient();
    private final String path = "/api/staff/payment-details";
    
    public List<PaymentDetailResponse> get() throws IOException {
        
        Request httpRequest = new Request.Builder()
                .url(AppManager.getWebName() + path)
                .addHeader("Authorization", "Bearer " + AppManager.getToken().getToken())
                .get()
                .build();
        
        try (Response response = client.newCall(httpRequest).execute()) {
            
            String jsonResponse = response.body().string();
            WebResponse<List<PaymentDetailResponse>> webResponse = om.readValue(
                    jsonResponse, new TypeReference<WebResponse<List<PaymentDetailResponse>>>(){}
            );
            
            Object errors = webResponse.getErrors();
            if (errors != null){
                String errorMessage;
                if (errors instanceof Map<?,?> map) {
                    errorMessage = map.values().stream()
                            .findFirst()
                            .map(Object::toString)
                            .orElse("Unknown error");
                } else {
                    errorMessage = errors.toString();
                }
                throw new IOException(errorMessage);
            }
            return webResponse.getData();
        }
    }
    
    public String add(PaymentDetailRequest request) throws IOException{
        String jsonRequest = om.writeValueAsString(request);
                
        RequestBody requestBody = RequestBody.create(jsonRequest, MediaType.parse("application/json"));
        Request httpRequest = new Request.Builder()
                .url(AppManager.getWebName() + path)
                .addHeader("Authorization", "Bearer " + AppManager.getToken().getToken())
                .post(requestBody)
                .build();
        
        try (Response response = client.newCall(httpRequest).execute()) {
            
            String jsonResponse = response.body().string();
            WebResponse<PaymentDetailResponse> webResponse;
            webResponse = om.readValue(
                    jsonResponse, new TypeReference<WebResponse<PaymentDetailResponse>>() {}
            );
            
            Object errors = webResponse.getErrors();
            if (errors != null){
                String errorMessage;
                if (errors instanceof Map<?,?> map) {
                    errorMessage = map.values().stream()
                            .findFirst()
                            .map(Object::toString)
                            .orElse("Unknown error");
                } else {
                    errorMessage = errors.toString();
                }
                throw new IOException(errorMessage);
            }
            return webResponse.getMessage();
        }
    }
    
    public String delete(String code) throws IOException{

        Request httpRequest = new Request.Builder()
                .url(AppManager.getWebName() + path + "/" + code)
                .addHeader("Authorization", "Bearer " + AppManager.getToken().getToken())
                .delete()
                .build();
        
        try (Response response = client.newCall(httpRequest).execute()) {
            
            String jsonResponse = response.body().string();
            WebResponse<String> webResponse = om.readValue(
                    jsonResponse, new TypeReference<WebResponse<String>>() {}
            );
            
            Object errors = webResponse.getErrors();
            if (errors != null){
                String errorMessage;
                if (errors instanceof Map<?,?> map) {
                    errorMessage = map.values().stream()
                            .findFirst()
                            .map(Object::toString)
                            .orElse("Unknown error");
                } else {
                    errorMessage = errors.toString();
                }
                throw new IOException(errorMessage);
            }
            return webResponse.getMessage();
        }
    }
    
    public String update(String code, PaymentDetailUpdate request) throws IOException{
        String jsonRequest = om.writeValueAsString(request);
                
        RequestBody requestBody = RequestBody.create(jsonRequest, MediaType.parse("application/json"));
        Request httpRequest = new Request.Builder()
                .url(AppManager.getWebName() + path + "/" + code)
                .addHeader("Authorization", "Bearer " + AppManager.getToken().getToken())
                .patch(requestBody)
                .build();
        
        try (Response response = client.newCall(httpRequest).execute()) {
            
            String jsonResponse = response.body().string();
            WebResponse<PaymentDetailResponse> webResponse = om.readValue(
                    jsonResponse, new TypeReference<WebResponse<PaymentDetailResponse>>(){}
            );
            
            Object errors = webResponse.getErrors();
            if (errors != null){
                String errorMessage;
                if (errors instanceof Map<?,?> map) {
                    errorMessage = map.values().stream()
                            .findFirst()
                            .map(Object::toString)
                            .orElse("Unknown error");
                } else {
                    errorMessage = errors.toString();
                }
                throw new IOException(errorMessage);
            }
            return webResponse.getMessage();
        }
    }
    
}
