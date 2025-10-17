package com.unindra.model.request;

import com.unindra.model.util.Gender;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentRequest {
    
    private String name;

    private Gender gender;

    private String birthPlaceRegency;

    private String birthDate;

    private Integer birthMonth;

    private String birthYear;

    private String districtAddress;

    private String address;

    private String username;

    private String email;

    private String phoneNumber;

    private String departmentName;

}