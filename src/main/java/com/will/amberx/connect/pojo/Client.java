package com.will.amberx.connect.pojo;

import com.will.amberx.connect.pojo.CaseDetails;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

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
