package com.unindra.model.request;

import lombok.Data;
import lombok.NoArgsConstructor;


/**
 *
 * @author rizmakiana
 */
@Data
@NoArgsConstructor
public class DepositRequest {

    private String date;

    private Integer month;

    private String year;

    private String clock;

    private String minute;

    private String referenceNo;

    private String amount;
 
}
