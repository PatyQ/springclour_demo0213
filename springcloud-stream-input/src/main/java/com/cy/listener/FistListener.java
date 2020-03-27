package com.cy.listener;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
public class FistListener {


    @StreamListener("thisIsOutPutChange")
    public void getInputMQ(String msg){
        System.err.println("从mq中接收到的消息为："+ msg);
    }
}
