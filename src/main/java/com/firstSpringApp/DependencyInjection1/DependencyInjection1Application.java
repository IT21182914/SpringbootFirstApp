package com.firstSpringApp.DependencyInjection1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjection1Application {

	public static void main(String[] args) {



	ApplicationContext context = SpringApplication.run(DependencyInjection1Application.class, args);

Car car =(Car) context.getBean(Car.class);
car.drive();

	}

}
