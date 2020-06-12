package com.xiantianxia.ribbon.service;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@RequestMapping("/vue")
public interface test_vueService {

    @RequestMapping("/test")
    public Map test();

}
