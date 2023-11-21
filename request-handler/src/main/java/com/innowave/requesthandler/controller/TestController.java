package com.innowave.requesthandler.controller;

import com.innowave.requesthandler.RequestHandlerApplication;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TestController {


    @GetMapping("/test")
    public String testService() {

        ApplicationContext context = SpringApplication.run(RequestHandlerApplication.class);


        Environment environment = context.getEnvironment();
        String port = environment.getProperty("server.port");

        System.out.println("Server is running on port: " + port);
        return "Server is running on port: " + port;
    }
}
