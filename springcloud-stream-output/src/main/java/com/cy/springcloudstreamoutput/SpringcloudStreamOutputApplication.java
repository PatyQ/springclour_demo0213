package com.cy.springcloudstreamoutput;

import com.cy.mq.BinderRabbitMQ;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication(scanBasePackages = "com.cy")
@EnableBinding(BinderRabbitMQ.class)
public class SpringcloudStreamOutputApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudStreamOutputApplication.class, args);
    }

}
