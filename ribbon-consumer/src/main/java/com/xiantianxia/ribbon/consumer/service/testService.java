package com.xiantianxia.ribbon.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class testService {
    @Autowired
    RestTemplate restTemplate;
    public String sayHello(){
        return restTemplate.getForObject("http://ribbon/hello?name=lllll     ",String.class);
    }
}