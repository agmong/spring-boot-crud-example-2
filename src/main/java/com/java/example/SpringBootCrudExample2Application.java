package com.java.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.java.example")
public class SpringBootCrudExample2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCrudExample2Application.class, args);
    }

}
