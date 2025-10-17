package com.unindra.model.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PaymentCategoryResponse {
 
    private String name;

    private Integer totalPayment;

}