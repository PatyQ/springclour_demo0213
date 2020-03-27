package com.cy.springcloudstreamoutput;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringcloudStreamOutputApplicationTests {

    @Test
    void contextLoads() {

        String s = "onetwothreeforefivetwo";

        while (true){
            String three = s.replace("three", "3");
            String two = three.replace("two", "2");
            System.out.println(two);
            break;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Singleton singleton = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();

        System.out.println(singleton == singleton2);
    }

}
