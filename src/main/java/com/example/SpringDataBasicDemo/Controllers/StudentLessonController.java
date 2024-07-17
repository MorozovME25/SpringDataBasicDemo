package com.example.SpringDataBasicDemo.Controllers;

import com.example.SpringDataBasicDemo.DTOs.TriesForThemesDTO;
import com.example.SpringDataBasicDemo.Services.StudentLessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentLessonController {
    @Autowired
    private StudentLessonService studentLessonService;

    @GetMapping("/student_recommend/{studentId}")
    public List<TriesForThemesDTO> getRecommendedThemesByStudentId(@PathVariable Integer studentId) {
        return studentLessonService.getRecommendedThemesByStudentId(studentId);
    }
}
