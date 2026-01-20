package com.example.day3studentmanagementsystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class StudentModel {
    private String id;
    private String name;
    private int age;
    private String email;



}
