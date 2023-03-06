package com.example.service1.service;


import com.example.service1.dto.Service1DTO;
import com.example.service1.entity.Service1Entity;
import com.example.service1.repo.Service1Repo;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import util.SharedUtil;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
//TODO: make this interface
public class HomeService {

    private final Service1Repo service1Repo;
    private final ModelMapper modelMapper;

    public String getMysqlUser(){
        return SharedUtil.sharedMethod();
    }

    public List<Service1DTO> getAll() {
        return service1Repo.findAll().stream().map(
                i -> modelMapper.map(i, Service1DTO.class)
        ).collect(Collectors.toList());
    }

    public Service1DTO set(Service1DTO service1DTO){
        Service1Entity service1 = modelMapper.map(service1DTO, Service1Entity.class);
        service1Repo.save(service1);
        return modelMapper.map(service1, Service1DTO.class);
    }

    public void delete(Service1DTO service1DTO){
        service1Repo.deleteById(service1DTO.getId());
    }
}
