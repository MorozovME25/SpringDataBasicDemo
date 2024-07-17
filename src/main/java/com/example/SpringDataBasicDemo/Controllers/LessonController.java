package com.example.SpringDataBasicDemo.Controllers;

import com.example.SpringDataBasicDemo.DTOs.LessonIDsForThemesDTO;
import com.example.SpringDataBasicDemo.Services.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LessonController {
    @Autowired
    private LessonService lessonService;

    @GetMapping("/recommended_lessons/{lessonId}")
    public List<LessonIDsForThemesDTO> getRecommendedLessonsByLessonId(@PathVariable Integer lessonId) {
        return lessonService.getRecommendedLessonsByLessonId(lessonId);
    }
}
