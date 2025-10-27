/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unindra.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.unindra.model.request.DepositRequest;
import com.unindra.model.response.DepositHistoryResponse;
import com.unindra.model.response.StudentDepositResponse;
import com.unindra.model.response.StudentDepositsHistory;
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
public class DepositService {
    
    private final ObjectMapper om = new ObjectMapper();
    private final OkHttpClient client = new OkHttpClient();
    private final String path = "/api/staff/deposits";
    
    public List<StudentDepositResponse> getAllStudentDeposit() throws IOException {
        
        Request httpRequest = new Request.Builder()
                .url(AppManager.getWebName() + path)
                .addHeader("Authorization", "Bearer " + AppManager.getToken().getToken())
                .get()
                .build();
        
        try (Response response = client.newCall(httpRequest).execute()) {
            
            String jsonResponse = response.body().string();
            WebResponse<List<StudentDepositResponse>> webResponse = om.readValue(
                    jsonResponse, new TypeReference<WebResponse<List<StudentDepositResponse>>>(){}
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
    
    public List<StudentDepositsHistory> getAllStudentDepositsHistory(String studentId) throws IOException {
        
        Request httpRequest = new Request.Builder()
                .url(AppManager.getWebName() + path + "/" + studentId)
                .addHeader("Authorization", "Bearer " + AppManager.getToken().getToken())
                .get()
                .build();
        
        try (Response response = client.newCall(httpRequest).execute()) {
            
            String jsonResponse = response.body().string();
            WebResponse<List<StudentDepositsHistory>> webResponse = om.readValue(
                    jsonResponse, new TypeReference<WebResponse<List<StudentDepositsHistory>>>(){}
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
    
    public String getReferenceNumber(String referenceType) throws IOException {
        
        Request httpRequest = new Request.Builder()
                .url(AppManager.getWebName() + path + "/reference-number?type=" + referenceType)
                .addHeader("Authorization", "Bearer " + AppManager.getToken().getToken())
                .get()
                .build();
        
        try (Response response = client.newCall(httpRequest).execute()) {
            
            String jsonResponse = response.body().string();
            WebResponse<String> webResponse = om.readValue(
                    jsonResponse, new TypeReference<WebResponse<String>>(){}
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
    
    public WebResponse<StudentDepositResponse> deposit(String studentId, DepositRequest request) throws IOException {
        String jsonRequest = om.writeValueAsString(request);
        
        RequestBody requestBody = RequestBody.create(jsonRequest, MediaType.parse("application/json"));
        
        Request httpRequest = new Request.Builder()
                .url(AppManager.getWebName() + path + "/" + studentId +"/deposit")
                .addHeader("Authorization", "Bearer " + AppManager.getToken().getToken())
                .post(requestBody)
                .build();
        
        try (Response response = client.newCall(httpRequest).execute()) {
            
            String jsonResponse = response.body().string();
            WebResponse<StudentDepositResponse> webResponse = om.readValue(
                    jsonResponse, new TypeReference<WebResponse<StudentDepositResponse>>(){}
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
            return webResponse;
        }
    }
    
    public WebResponse<StudentDepositResponse> withdraw(String studentId, DepositRequest request) throws IOException {
        String jsonRequest = om.writeValueAsString(request);
        
        RequestBody requestBody = RequestBody.create(jsonRequest, MediaType.parse("application/json"));
        
        Request httpRequest = new Request.Builder()
                .url(AppManager.getWebName() + path + "/" + studentId +"/withdraw")
                .addHeader("Authorization", "Bearer " + AppManager.getToken().getToken())
                .post(requestBody)
                .build();
        
        try (Response response = client.newCall(httpRequest).execute()) {
            
            String jsonResponse = response.body().string();
            WebResponse<StudentDepositResponse> webResponse = om.readValue(
                    jsonResponse, new TypeReference<WebResponse<StudentDepositResponse>>(){}
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
            return webResponse;
        }
    }
    
    public List<DepositHistoryResponse> getDepositsHistory() throws IOException {
        
        Request httpRequest = new Request.Builder()
                .url(AppManager.getWebName() + path + "/history")
                .addHeader("Authorization", "Bearer " + AppManager.getToken().getToken())
                .get()
                .build();
        
        try (Response response = client.newCall(httpRequest).execute()) {
            
            String jsonResponse = response.body().string();
            WebResponse<List<DepositHistoryResponse>> webResponse = om.readValue(
                    jsonResponse, new TypeReference<WebResponse<List<DepositHistoryResponse>>>(){}
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
    
}
