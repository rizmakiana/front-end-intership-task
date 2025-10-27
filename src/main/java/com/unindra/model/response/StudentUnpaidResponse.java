package com.unindra.model.response;

import java.math.BigDecimal;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rizmakiana
 */
@Data
@NoArgsConstructor
public class StudentUnpaidResponse {

    private String studentId;

    private String studentName;

    private BigDecimal totalUnpaid;
}