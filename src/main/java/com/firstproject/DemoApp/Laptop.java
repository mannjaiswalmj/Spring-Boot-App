package com.firstproject.DemoApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary        // PRIMARY will help in case of multiple components
public class Laptop implements Computer {

    public void compile(){
        System.out.println("Laptop, Error doo error! ");
    }
    
}
