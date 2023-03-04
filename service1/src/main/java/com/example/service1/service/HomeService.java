package com.example.service1.service;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import util.SharedUtil;

@Service
@RequiredArgsConstructor
//TODO: make this interface
public class HomeService {
    @Value("${test.mysql}")
    private String mysqlUser;

    public String getMysqlUser(){
        return mysqlUser + SharedUtil.sharedMethod();
    }
}
