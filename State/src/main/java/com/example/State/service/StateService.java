package com.example.State.service;

import com.example.State.dto.Responsedto;
import com.example.State.model.State;

import java.util.List;

public interface StateService {
    
   List<State> addAllStates(List<State> stateList);

   Responsedto getState(String stateCode);
}
