package com.lzf.export.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String test1(){
        return "hello, world";
    }
}
