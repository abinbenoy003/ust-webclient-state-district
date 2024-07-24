package com.example.State.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="state")
public class State {

    @Id
    private Long stateId;
    private String stateName;
    private String stateCode;
    private String stateCapital;

}
