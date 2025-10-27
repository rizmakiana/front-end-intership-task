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
public class StudentDepositsHistory {
    
    private String referenceNo;

    private String date;

    private BigDecimal depositAmount;

    private BigDecimal withdrawAmount;

}