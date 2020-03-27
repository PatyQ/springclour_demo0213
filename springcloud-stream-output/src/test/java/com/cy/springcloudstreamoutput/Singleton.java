package com.cy.springcloudstreamoutput;

public class Singleton {
    private Singleton(){}

    public static Singleton singleton = null;

    public static Singleton getSingleton(){

        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
