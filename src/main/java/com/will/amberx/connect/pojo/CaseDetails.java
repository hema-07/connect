package com.will.amberx.connect.pojo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import java.util.Map;

@Getter
@Setter
@Builder
public class CaseDetails {

    private String clientId;
    private String consultantId;
    private Enum caseCatagory;
    private String caseDescription;
    private Map<String, String> comments;
    private Map<String, String> communicationHistory;
}
