package com.cy.controller;

import com.cy.mapper.ProMapper;
import com.cy.pojo.TStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("provider")
public class ProController {

    @Autowired
    private ProMapper proMapper;

    @RequestMapping("getStu/{id}")
    public TStudent getProMapper(@PathVariable("id")Integer id){
        System.out.println("接收到的ID为： "+ id);
        TStudent tStudent = proMapper.getStu(id);
        return tStudent;
    }

}
