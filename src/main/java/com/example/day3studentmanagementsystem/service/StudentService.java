package com.example.day3studentmanagementsystem.service;

import com.example.day3studentmanagementsystem.model.StudentModel;
import com.example.day3studentmanagementsystem.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final  StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    //create
    public StudentModel addStudent(StudentModel student){
        return repository.save(student);
    }
}
