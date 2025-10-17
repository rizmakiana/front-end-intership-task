package com.unindra.model.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PaymentDetailUpdate {
    
    private String name;

    private String unitPrice;

}