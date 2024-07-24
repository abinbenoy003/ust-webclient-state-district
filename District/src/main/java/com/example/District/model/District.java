package com.example.District.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="district")
public class District {

    @Id
    private Long districtId;
    private String districtName;
    private Long stateId;
    private String stateName;
    private String stateCode;
}
