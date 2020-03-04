package com.cy.controller;

import com.cy.mq.InputRabbitMQ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InputController {

    @Autowired
    private InputRabbitMQ inputRabbitMQ;



}
