package com.example.demo.controllers;

import com.example.demo.Entity.Student;
import com.example.demo.services.userService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {


    private final userService userservice;

    public Controller(userService service) {
        this.userservice =  service;
    }

    @GetMapping("/")
    public List<Student> getStudents(){

        return userservice.getStudents();
    }

    @PostMapping("/")
    public String addStudents(@RequestBody Student s){

        return userservice.addStudent(s);
    }
}
