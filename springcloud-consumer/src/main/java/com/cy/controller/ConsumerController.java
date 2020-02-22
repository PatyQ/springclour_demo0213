package com.cy.controller;

import com.cy.pojo.TStudent;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private EurekaClient eurekaClient;

//    @RequestMapping("getStu/{id}")
//    public TStudent conGetStudet(@PathVariable("id")Integer id){
//        TStudent stu = restTemplate.getForObject("http://localhost:10020/provider/getStu/" + id, TStudent.class);
//        return stu;
//    }

//    @RequestMapping("getStu/{id}")
//    public TStudent conGetStudet(@PathVariable("id")Integer id){
//        InstanceInfo nextServerFromEureka = eurekaClient.getNextServerFromEureka("SPRING-PROVIDER02", true);
//        String url = nextServerFromEureka.getHomePageUrl();
//        TStudent stu = restTemplate.getForObject(url + "/provider/getStu/" + id, TStudent.class);
//        return stu;
//    }


    //在启动类上设置@loadbalance之后会直接从注册中心查找该名称下的url
    @RequestMapping("getStu/{id}")
    public TStudent conGetStudet(@PathVariable("id")Integer id){
        TStudent stu = restTemplate.getForObject("http://SPRING-PROVIDER02/provider/getStu/" + id, TStudent.class);
        return stu;
    }

}
