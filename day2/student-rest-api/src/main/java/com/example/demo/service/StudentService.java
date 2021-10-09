package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.*;
import com.example.demo.ifaces.StudentRepository;

import java.util.*;

@Service
public class StudentService {
   @Autowired
   private StudentRepository repo;
   
   public List<Student> findAll(){
	   return this.repo.findAll();
   }
   
   public Student add(Student entity) {
	   return this.repo.save(entity);
   }
   
   
}
