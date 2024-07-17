package com.example.SpringDataBasicDemo.Controllers;

import com.example.SpringDataBasicDemo.Services.TutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TutorController {
    @Autowired
    private TutorService tutorService;
}
