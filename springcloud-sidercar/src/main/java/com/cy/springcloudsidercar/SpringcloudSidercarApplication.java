package com.cy.springcloudsidercar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "com.cy")
@EnableEurekaClient
@EnableDiscoveryClient
public class SpringcloudSidercarApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudSidercarApplication.class, args);
    }

}
