package com.cy.springcloudprovider02;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "com.cy")
@EnableEurekaClient
@MapperScan(basePackages = "com.cy.mapper")
public class SpringcloudProvider02Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudProvider02Application.class, args);
    }

}
