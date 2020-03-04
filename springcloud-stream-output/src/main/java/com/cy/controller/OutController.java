package com.cy.controller;

import com.cy.mq.BinderRabbitMQ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OutController {

    @Autowired
    private BinderRabbitMQ binderRabbitMQ;

    @RequestMapping("/getOut/{name}")
    public String outPutMsg(@PathVariable String name){

        MessageChannel messageChannel = binderRabbitMQ.thisIsOutPutChange();
        GenericMessage<String> message = new GenericMessage(name);
        boolean send = messageChannel.send(message);
        System.out.println("发送的情况：" + send);
        return "success";
    }

}
