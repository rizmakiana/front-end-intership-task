package com.unindra.model.response;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rizmakiana
 */
@Data
@NoArgsConstructor
public class StudentTable {

    private String studentId;

    private String name;

    private String gender;

    private String regencyName;

    private String birthDate;

    private String department;

    private String classroom;

    private String section;

}
