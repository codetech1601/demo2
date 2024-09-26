package com.example.demo.services;


import com.example.demo.Entity.Student;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class userService {

public static List<Student> list = new ArrayList<Student>();

    public List<Student> getStudents(){
        return list;
    }

    public String addStudent(Student s){
list.add(s);
return "student added successfully";
    }
}
