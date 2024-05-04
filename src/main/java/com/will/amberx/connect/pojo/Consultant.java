package com.will.amberx.connect.pojo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Builder
public class Consultant {
    private String firstName;
    private String lastName;
    private String company;
    private Date dateOfBirth;
    private int experience;
    private List<String> skills;
    private String consultantId;
    private List<Client> clientList;
    private List<CaseDetails> caseDetails;
}
