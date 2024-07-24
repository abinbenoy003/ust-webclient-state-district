package com.example.District.service;

import com.example.District.model.District;
import com.example.District.repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictService {

    @Autowired
    private DistrictRepository districtRepository;

    public List<District> addDistricts(List<District> districtList) {
        return districtRepository.saveAll(districtList);
    }


    public List<District> getDistrictsByStateCode(String stateCode) {
        return districtRepository.findByStateCode(stateCode);
    }
}
