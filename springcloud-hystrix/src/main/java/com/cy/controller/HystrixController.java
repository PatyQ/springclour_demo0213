package com.cy.controller;

import com.cy.feign.FeignServer;
import com.cy.pojo.TStudent;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixController {

    @Autowired
    private FeignServer feignServer;


    @RequestMapping("getStu/{id}")
    @HystrixCommand(fallbackMethod = "haHa")
    public String getStudent(@PathVariable Integer id){
        TStudent user = feignServer.getUser(id);
        return user.toString();
    }

    public String haHa(Integer id){
        return "这是降级方法啊";
    }

}
