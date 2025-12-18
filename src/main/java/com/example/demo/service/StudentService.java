package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.StudentEntity;

public interface StudentService {

    List<StudentEntity> getAll();

    StudentEntity addStudent(StudentEntity student);
}
