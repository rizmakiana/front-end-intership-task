package com.unindra.model.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PaymentDetailRequest {
    
    private String categoryName;

    private String classroomCode;

    private String name;

    private String unitPrice;

}