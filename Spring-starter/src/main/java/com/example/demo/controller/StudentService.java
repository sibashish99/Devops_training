package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;

@RestController
@RequestMapping(path = "/api/v1/students")
public class StudentService {
	   @Autowired
	   private StudentService service;
	   
	   @GetMapping(path = "/{id}")
	   public Book getBookById(@PathVariable("id") int id) {
		   return this.service.getBookById(id);
	   }
}
