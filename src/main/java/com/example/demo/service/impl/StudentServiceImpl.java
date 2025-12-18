package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepo;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepo repo;

    public StudentServiceImpl(StudentRepo repo) {
        this.repo = repo;
    }

    @Override
    public List<StudentEntity> getAll() {
        return repo.findAll();
    }

    @Override
    public StudentEntity addStudent(StudentEntity student) {
        return repo.save(student);
    }
}
