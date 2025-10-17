package com.unindra.model.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SectionResponse {
    
    private String code;

    private String departmentName;

    private String gradeLevel;

    private Character name;

    private Integer totalStudents;

}