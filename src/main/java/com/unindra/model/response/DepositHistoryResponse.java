package com.unindra.model.response;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rizmakiana
 */
@Data
@NoArgsConstructor
public class DepositHistoryResponse {

    private String referenceNumber;

    private String studentName;

    private String date;

    private String depositAmount;

    private String withdrawalAmount;
    
}