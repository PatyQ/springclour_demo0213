package com.cy.springcloudconfigserver;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringcloudConfigServerApplicationTests {

    @Test
    void contextLoads() {
    }


    public static void main(String[] args) {
        int random = (int)(Math.random()*100);
        System.out.println(random);

        int i = random;
        System.out.println("i :"+i);
        for (int j = 0; j< 1000 ; j++){
            int rom = (int)(Math.random()*15+5);
            System.out.println(rom);
        }
    }

}
