package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserDataController {
    @Autowired
    private UserDataRepository repository;

    @RequestMapping("/test")
    public void findAll() {
        List<UserData> users = repository.findAll();


            System.out.println(users);

    }
}
