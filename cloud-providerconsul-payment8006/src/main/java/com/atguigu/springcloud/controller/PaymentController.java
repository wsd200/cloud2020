package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Author: wsd
 * @Create: 2023-01-04 15:30
 * @Description:
 */
@RestController
public class PaymentController{
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/consul")
    public String paymentInfo(){
        return "springcloud with consul: "+serverPort+"\t\t"+ UUID.randomUUID().toString();
    }
}

