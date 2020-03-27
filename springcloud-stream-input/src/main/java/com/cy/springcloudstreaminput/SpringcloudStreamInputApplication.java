package com.cy.springcloudstreaminput;

import com.cy.mq.InputRabbitMQ;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication(scanBasePackages = "com.cy")
@EnableBinding(InputRabbitMQ.class)
public class SpringcloudStreamInputApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudStreamInputApplication.class, args);
    }

}
