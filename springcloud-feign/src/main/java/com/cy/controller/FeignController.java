package com.cy.controller;

import com.cy.feign.FeignServer;
import com.cy.pojo.TStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    private FeignServer feignServer;

    @RequestMapping("get/{id}")
    public TStudent getUser(@PathVariable Integer id){
        TStudent stu = feignServer.getStu(id);
        return stu;
    }

}
