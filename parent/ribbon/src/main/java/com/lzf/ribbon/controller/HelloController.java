package com.lzf.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping(value = "/ribbon/hello")
    @ResponseBody
    public String hello(){
        String result = restTemplate.getForObject("http://hello-service/hello",String.class);
        return result;
    }
}
