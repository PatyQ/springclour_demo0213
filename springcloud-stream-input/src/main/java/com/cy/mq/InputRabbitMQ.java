package com.cy.mq;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

@Component
public interface InputRabbitMQ {

    @Input("thisIsOutPutChange")
    SubscribableChannel inputMethod();

}
