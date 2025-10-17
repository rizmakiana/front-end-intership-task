/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unindra.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.unindra.model.request.ClassroomRequest;
import com.unindra.model.response.ClassroomResponse;
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
public class ClassroomService {
    
    private final ObjectMapper om = new ObjectMapper();
    private final OkHttpClient client = new OkHttpClient();
    private final String path = "/api/staff/classrooms";
    
    public List<ClassroomResponse> getAll() throws IOException {
        
        Request httpRequest = new Request.Builder()
                .url(AppManager.getWebName() + path)
                .addHeader("Authorization", "Bearer " + AppManager.getToken().getToken())
                .get()
                .build();
        
        try (Response response = client.newCall(httpRequest).execute()) {
            
            String jsonResponse = response.body().string();
            WebResponse<List<ClassroomResponse>> webResponse = om.readValue(
                    jsonResponse, new TypeReference<WebResponse<List<ClassroomResponse>>>() {}
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
    
    public String add(ClassroomRequest request) throws IOException{
        String jsonRequest = om.writeValueAsString(request);
                
        RequestBody requestBody = RequestBody.create(jsonRequest, MediaType.parse("application/json"));
        Request httpRequest = new Request.Builder()
                .url(AppManager.getWebName() + path)
                .addHeader("Authorization", "Bearer " + AppManager.getToken().getToken())
                .post(requestBody)
                .build();
        
        try (Response response = client.newCall(httpRequest).execute()) {
            
            String jsonResponse = response.body().string();
            WebResponse<ClassroomResponse> webResponse = om.readValue(
                    jsonResponse, new TypeReference<WebResponse<ClassroomResponse>>() {}
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
    
}
