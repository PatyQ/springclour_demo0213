package com.cy.springcloudhystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "com.cy")
@EnableEurekaClient
@EnableCircuitBreaker//启动hystrix
@EnableFeignClients(basePackages = "com.cy")
public class SpringcloudHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudHystrixApplication.class, args);
    }

}
