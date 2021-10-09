package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@Repository
@RequestMapping(path = "/api/v1")
public class StudentController {
    @Autowired
    private StudentService service;
    
    
    @GetMapping(path ="/colleges")
    public List<Student> getAll(){
    	return this.service.findAll();
    }
    
    @PostMapping(path ="/colleges")
    public Student add(@RequestBody Student entity) {
    	return this.service.add(entity);
    }
}
