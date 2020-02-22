package com.cy.controller;

import com.cy.pojo.TStudent;
import com.cy.service.ProService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "get")
public class ProviderController {

    @Autowired
    private ProService proService;

    @RequestMapping("user/{id}")//resful风格注解
    public TStudent getUser(@PathVariable Integer id){
        System.out.println("接收到的ID值为"+ id);
        TStudent user = proService.getUser(id);
        return user;
    }
}
