package com.example.demo.repository;

import org.springframework.data.java.repository.javaRepository;
import org.springframework.stereotype.*;
import com.example.demo.entity.studentEntity;
   
public interface StudentRepo extends javaRepository<studentEntity,Long>{

}