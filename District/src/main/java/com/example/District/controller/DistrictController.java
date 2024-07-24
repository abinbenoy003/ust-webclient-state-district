package com.example.District.controller;

import com.example.District.model.District;
import com.example.District.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/district")
public class DistrictController {

    @Autowired
    private DistrictService districtService;

    @PostMapping("/addDistricts")
    public List<District> addDistricts(@RequestBody List<District> districtList){
        return districtService.addDistricts(districtList);
    }

    @GetMapping("{stateCode}")
    public List<District> getDistrictsByStateCode(@PathVariable String stateCode){
        return districtService.getDistrictsByStateCode(stateCode);
    }
}
