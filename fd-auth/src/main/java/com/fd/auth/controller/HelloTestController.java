package com.fd.auth.controller;

import com.fd.auth.feign.HelloManager;
import com.mq.common.vo.RestResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloTestController {

    @Autowired
    private HelloManager helloManager;

    @GetMapping("hellotest")
    public RestResult<String> helloTest() {
        return helloManager.hello("aaa");
    }
}
