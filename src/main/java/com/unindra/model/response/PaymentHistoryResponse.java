package com.unindra.model.response;

import java.math.BigDecimal;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rizmakiana
 */
@Data @NoArgsConstructor
public class PaymentHistoryResponse {
    
    private String referenceNumber;

    private String studentName;

    private String date;

    private BigDecimal totalAmount;
    
}
