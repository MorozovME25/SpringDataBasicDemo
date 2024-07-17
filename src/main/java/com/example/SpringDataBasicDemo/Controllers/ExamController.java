package com.example.SpringDataBasicDemo.Controllers;

import com.example.SpringDataBasicDemo.DTOs.CommentDTO;
import com.example.SpringDataBasicDemo.DTOs.ThemeDTO;
import com.example.SpringDataBasicDemo.DTOs.ThemeResultsDTO;
import com.example.SpringDataBasicDemo.Services.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExamController {
    @Autowired
    private ExamService examService;

    @GetMapping("/exam_comment/{examId}")
    public CommentDTO getCommentByExamId(@PathVariable Integer examId) {
        return examService.getCommentByExamId(examId);
    }

    @GetMapping("/exam_result/{examId}")
    public List<ThemeResultsDTO> getThemeResultsByExamId(@PathVariable Integer examId) {
        return examService.getThemeResultsByExamId(examId);
    }

    @GetMapping("/exams_results/")
    public List<ThemeDTO> getThemesOrderedByExamResults() {
        return examService.getThemesOrderedByExamResults();
    }
}