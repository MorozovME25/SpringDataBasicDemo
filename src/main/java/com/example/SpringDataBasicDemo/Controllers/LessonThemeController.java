package com.example.SpringDataBasicDemo.Controllers;

import com.example.SpringDataBasicDemo.Services.LessonThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LessonThemeController {
    @Autowired
    private LessonThemeService lessonThemeService;
}
