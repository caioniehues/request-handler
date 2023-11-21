package com.innowave.requesthandler.controller;

import com.innowave.requesthandler.RequestHandlerApplication;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.netflix.eureka.EurekaInstanceConfigBean;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class TestController {

    @Autowired
    private EurekaInstanceConfigBean eurekaInstanceConfig;

    @GetMapping("/test")
    public String testService() {
        return "Eureka Instance ID: " + eurekaInstanceConfig.getInstanceId();    }
}
