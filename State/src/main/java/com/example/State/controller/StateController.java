package com.example.State.controller;

import com.example.State.dto.Responsedto;
import com.example.State.dto.Statedto;
import com.example.State.model.State;
import com.example.State.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/state")
public class StateController {

    @Autowired
    private StateService stateService;

    @PostMapping("/addstates")
    public ResponseEntity<List<State>> addAllStates(@RequestBody List<State> stateList){
        return ResponseEntity.ok(stateService.addAllStates(stateList));
    }

    @GetMapping("getDistricts/{stateCode}")
    public ResponseEntity<Responsedto> getDistrictsByStateCode(@PathVariable("stateCode") String stateCode){
        Responsedto responseDto=stateService.getState(stateCode);
        return ResponseEntity.ok(responseDto);
    }
}
