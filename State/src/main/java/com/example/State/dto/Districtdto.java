package com.example.State.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Districtdto {
    private Long districtId;
    private String districtName;
    private Long stateId;
    private String stateName;
    private String stateCode;
}
