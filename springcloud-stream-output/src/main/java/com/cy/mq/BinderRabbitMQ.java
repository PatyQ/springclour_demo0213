package com.cy.mq;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

@Component
public interface BinderRabbitMQ {

    @Output("thisIsOutPutChange")
    MessageChannel thisIsOutPutChange();

}
