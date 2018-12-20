package com.mq.upms.controller;

import com.mq.common.vo.RestResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * hello world
 *
 * @author mq
 */
@RequestMapping("/hello")
@RestController
public class HelloController {

    @GetMapping
    public RestResult<String> hello(String name) {
        return RestResult.ok("hello world, " + name);
    }
}
