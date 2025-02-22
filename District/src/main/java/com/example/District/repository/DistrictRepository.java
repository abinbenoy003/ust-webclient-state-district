package com.example.District.repository;

import com.example.District.model.District;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DistrictRepository extends JpaRepository<District,Long> {
    List<District> findByStateCode(String stateCode);
}
