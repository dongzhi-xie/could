package com.xiantianxia.ribbon.consumer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
    @Autowired
    private com.xiantianxia.ribbon.consumer.service.testService testService;
    @GetMapping("/hello")
    public String sayHello(String name){

        return testService.sayHello()+""+name+"世界那抹大，可以去看看";
    }
}
