package com.unindra.model.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PaymentDetailResponse {
    
    private String categoryName;

    private String classroomCode;

    private String paymentName;

    private String unitPrice;

}