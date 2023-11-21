package pt.nos.ms.requesthandler.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EurekaInstanceConfigBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private EurekaInstanceConfigBean eurekaInstanceConfig;

    @GetMapping("/test")
    public String testService() {
        return "Eureka Instance ID: " + eurekaInstanceConfig.getInstanceId();    }
}
