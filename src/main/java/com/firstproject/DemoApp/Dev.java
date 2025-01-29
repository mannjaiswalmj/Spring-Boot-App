package com.firstproject.DemoApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class Dev {

//field injection
    @Autowired                               // it Automatically connects the classes
    @Qualifier("laptop")                    // explicitly defining which class to use (it is not the class name, but the instance of it [bean name])
    private Computer comptuer;              //means Same name as class "Laptop" but in small letters "laptop"
    // Laptop laptop; 
    

 //constructor injection
    //  public Dev(Laptop laptop){         
    //     this.laptop = laptop;
    // }
    
 // setter injection
    // @Autowired
    // public void setLaptop(Laptop laptop){     
    //     this.laptop = laptop;
    // }

    public void build(){
        comptuer.compile();
        System.out.println("We are Build an awesome project");
    }
    
}
