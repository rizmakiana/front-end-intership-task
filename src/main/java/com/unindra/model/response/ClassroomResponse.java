package com.unindra.model.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ClassroomResponse {
    
    private String code;

    private String departmentName;

    private String gradeLevel;

    private Integer totalSection;

}