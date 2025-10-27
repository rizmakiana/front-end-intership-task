package com.unindra.model.request;

import com.unindra.model.response.PaymentDetailBillResponse;
import java.math.BigDecimal;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rizmakiana
 */
@Data @NoArgsConstructor
public class PaymentRequest {
   
    private String referenceNumber;
    
    private BigDecimal amount;

    private List<PaymentDetailBillResponse> payments;
    
}