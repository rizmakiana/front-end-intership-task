package com.unindra.model.response;

import java.math.BigDecimal;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rizmakiana
 */
@Data @NoArgsConstructor
public class PaymentDetailBillResponse {

    private String paymentCategory;

    private String name;

    private BigDecimal unitPrice;
    
}