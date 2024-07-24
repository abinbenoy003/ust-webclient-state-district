package com.example.State.service;

import com.example.State.dto.Districtdto;
import com.example.State.dto.Responsedto;
import com.example.State.dto.Statedto;
import com.example.State.model.State;
import com.example.State.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class StateServiceimpl implements StateService{

    @Autowired
    private StateRepository stateRepository;

    @Autowired
    private WebClient webClient;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<State> addAllStates(List<State> stateList){
        return stateRepository.saveAll(stateList);
    }

    @Override
    public Responsedto getState(String stateCode){
        Responsedto responseDto=new Responsedto();
        State state= stateRepository.findByStateCode(stateCode).orElseThrow(()-> new RuntimeException("State not found"));
        Statedto stateDto=mapToState(state);

//        List<Districtdto> districtdtoList = webClient.get()
//                .uri("hhtp://localhost:9098/district/"+state.getStateCode())
//                .retrieve()
//                .bodyToMono(new ParameterizedTypeReference<List<Districtdto>>() {})
//                .block();
        List<Districtdto> districtdtoList=restTemplate.getForObject("http://localhost:9098/district/"+state.getStateCode(),List.class);
        responseDto.setState(stateDto);
        responseDto.setDistrict(districtdtoList);

        return responseDto;
    }

    private Statedto mapToState(State state){
        Statedto dto=new Statedto();
        dto.setStateId(state.getStateId());
        dto.setStateName(state.getStateName());
        dto.setStateCode(state.getStateCode());
        dto.setStateCapital(state.getStateCapital());
        return dto;
    }
}
