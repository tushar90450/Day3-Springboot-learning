package com.example.day3studentmanagementsystem.Exception;

public class StudentNotFound extends RuntimeException {
    public StudentNotFound(String message) {
        super(message);
    }
}