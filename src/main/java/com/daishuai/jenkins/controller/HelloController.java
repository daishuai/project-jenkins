package com.daishuai.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2019/3/24 19:38
 * @Version: 1.0
 * Copyright: Copyright (c) 2019
 */
@RestController
public class HelloController {


    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
