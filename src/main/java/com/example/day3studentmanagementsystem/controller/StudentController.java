package com.example.day3studentmanagementsystem.controller;

import com.example.day3studentmanagementsystem.model.StudentModel;
import com.example.day3studentmanagementsystem.service.StudentService;
//import org.springframework.web.bind.annotation.GetMapping;
import com.example.day3studentmanagementsystem.dto.StudentRequestDto;
import com.example.day3studentmanagementsystem.dto.StudentResponseDto;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service){
        this.service = service;
    }

    // create function Api

    @PostMapping("/add_student")
    public StudentResponseDto addStudent(@Valid  @RequestBody StudentRequestDto student){
        return service.addStudent(student);

    }

    // Display Student

    @GetMapping("/students")
    public List<StudentResponseDto> getStudents(){
        return service.getStudent();
    }

    @PutMapping("/update/{id}")
    public StudentResponseDto updateStudent(@PathVariable String id, @RequestBody StudentRequestDto student){
        return service.update(id,student);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }






}