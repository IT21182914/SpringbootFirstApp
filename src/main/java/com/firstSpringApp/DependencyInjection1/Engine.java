package com.firstSpringApp.DependencyInjection1;

import org.springframework.stereotype.Component;

@Component
public class Engine {

    public void forward() {
        System.out.println("Go Forward");
    }
}
