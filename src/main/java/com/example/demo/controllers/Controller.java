package com.example.demo.controllers;

import com.example.demo.services.userService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private userService userservice;

    public Controller(userService service) {
        this.userservice =  service;
    }

    @GetMapping("/")
    public String hello(){

        return userservice.getHello();
    }
}
