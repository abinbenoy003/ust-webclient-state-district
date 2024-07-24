package com.example.State.dto;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Statedto {

    private Long stateId;
    private String stateName;
    private String stateCode;
    private String stateCapital;
}
