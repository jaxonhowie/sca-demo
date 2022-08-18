package com.example.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Desc:
 *
 * @author Hongyi Zheng
 * @date 2022/8/18
 */
@RestController
@RequestMapping("/test")
public class ConsumerTestController {

    private final RestTemplate restTemplate;

    public ConsumerTestController(@Qualifier(value = "lbRestTemplate") RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/consumer/port")
    public String consumePort(){
        return "Consumer port : " + restTemplate.getForObject("http://nacos-provider/test/get/port", String.class);
    }
}
