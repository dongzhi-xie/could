package com.xiantianxia.feign.controller;

import com.xiantianxia.feign.service.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
    @Autowired
    private testService testService;
    @GetMapping("/hello")
    public String sayHello(String name){

        return testService.sayHello()+""+name+"咱们一起去看";
    }
}
