package com.example.demo;

import com.example.demo.controller.UserDataController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        UserDataController userDataController = new UserDataController();
        userDataController.findAll();
    }

}
