package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Desc:
 *
 * @author Hongyi Zheng
 * @date 2022/8/18
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/get/port")
    public String getPort(){
        return "Provider port is :" + serverPort;
    }
}
