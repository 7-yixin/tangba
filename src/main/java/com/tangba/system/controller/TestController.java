package com.tangba.system.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/tangba/")
public class TestController {
    @GetMapping("/test")
    public String test(){
        return "成功访问";
    }
}
