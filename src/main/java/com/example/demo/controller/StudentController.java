package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public List<StudentEntity> getAll() {
        return service.getAll();
    }

    @PostMapping
    public StudentEntity addStudent(@Valid @RequestBody StudentEntity student) {
        return service.addStudent(student);
    }
}
