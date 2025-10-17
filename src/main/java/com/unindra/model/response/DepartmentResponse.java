package com.unindra.model.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DepartmentResponse {

    private String departmentName;

    private String code;

    private Integer totalClassroom;
    
}