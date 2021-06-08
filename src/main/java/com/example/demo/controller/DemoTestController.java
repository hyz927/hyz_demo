package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demoTest")
public class DemoTestController {
    //@Value("${my.name}")
    private String name;
    @RequestMapping("hello")
    public String  hello(){
        return name;
    }
}
