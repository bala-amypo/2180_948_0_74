package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.StudentEntity;

public interface StudentService {
    List<StudentEntity> getAllStudents();
    StudentEntity saveStudent(StudentEntity student);
}
