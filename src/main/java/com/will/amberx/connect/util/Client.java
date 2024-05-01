package com.will.amberx.connect.util;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@Builder
public class Client {

    private String firstName;
    private String lastName;
    private String company;
    private Date dateOfBirth;
    private int experience;
    private List<String> skills;
    private String clinetId;
    private List<CaseDetails> caseDetails;
}
