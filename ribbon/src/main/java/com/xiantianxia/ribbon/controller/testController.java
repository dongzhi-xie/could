package com.xiantianxia.ribbon.controller;

import com.xiantianxia.ribbon.service.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
    @Autowired
    private testService testService;
    @GetMapping("/hello")
    public String sayHello(String name){

        return testService.sayHello()+"   "+name+"  世界那抹大，可以去看看";
    }
}
