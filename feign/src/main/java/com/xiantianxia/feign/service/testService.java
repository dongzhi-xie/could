package com.xiantianxia.feign.service;

import com.xiantianxia.feign.rpc.GetHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class testService {
    @Autowired
    private GetHello getHello;//注入rpc

    public String sayHello(){
        return getHello.sayHello();// 提供一个hello World
    }
}
