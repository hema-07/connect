package com.will.amberx.connect.util;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class ConsultantDetails {

    private String consultantId;
    private List<Client> clientList;
}
