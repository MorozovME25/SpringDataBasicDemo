package com.example.SpringDataBasicDemo.Services;

import com.example.SpringDataBasicDemo.DTOs.CommentDTO;
import com.example.SpringDataBasicDemo.DTOs.ThemeDTO;
import com.example.SpringDataBasicDemo.DTOs.ThemeResultsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class ExamService {
    @Autowired
    private com.example.SpringDataBasicDemo.Repo.ExamRepository examRepository;

    public CommentDTO getCommentByExamId (Integer examId) {
        return new CommentDTO(examRepository.getCommentByExamId(examId));
    }
    public List<ThemeResultsDTO> getThemeResultsByExamId (Integer examId) {
        List<Object[]> rawDTOs = examRepository.getThemeResultsByExamId(examId);
        List<ThemeResultsDTO> themeResultsDTOs = new java.util.ArrayList<>(List.of());

        for (Object[] rawDTO : rawDTOs) {
            themeResultsDTOs.add(new ThemeResultsDTO((String) rawDTO[0], (boolean) rawDTO[1]));
        }
        return themeResultsDTOs;
    }
    public List<ThemeDTO> getThemesOrderedByExamResults () {

        Timestamp date1 = Timestamp.valueOf(LocalDateTime.of(2024, 6, 15, 0, 0));
        Timestamp date2 = Timestamp.valueOf(LocalDateTime.of(2024, 7, 15, 0, 0));

        List<String> themes = examRepository.getThemesOrderedByExamResults(date1, date2);
        List<ThemeDTO> themeDTOs = new java.util.ArrayList<>(List.of());

        for (String theme : themes) {
            themeDTOs.add(new ThemeDTO((String) theme));
        }
        return themeDTOs;
    }
}
