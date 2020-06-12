package com.xiantianxia.ribbon.service.impl;

import com.xiantianxia.ribbon.service.test_vueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class test_vueServiceImpl implements test_vueService {

    @Autowired
    private test_vueService test_vueService;

    @Override
    public Map test() {
        Map map=new HashMap();
        map.put("one","一");
        map.put("two","二");
        map.put("three","三");
        map.put("four","四");
        return map;
    }
}
