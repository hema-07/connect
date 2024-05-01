package com.will.amberx.connect.util;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
@Builder
public class CaseDetails {

    private String clientId;
    private Map<Consultant, String> caseHistory;
}
