package com.example.SpringDataBasicDemo.Controllers;


import com.example.SpringDataBasicDemo.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
}
