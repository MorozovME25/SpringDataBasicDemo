package com.example.SpringDataBasicDemo.Services;

import com.example.SpringDataBasicDemo.DTOs.TriesForThemesDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentLessonService {
    @Autowired
    private com.example.SpringDataBasicDemo.Repo.StudentLessonRepository studentLessonRepository;

    public List<TriesForThemesDTO> getRecommendedThemesByStudentId(Integer studentId) {
        List<Object[]> rawDTOs = studentLessonRepository.getThemeTitlesOrderedByStudentId(studentId);
        List<TriesForThemesDTO> triesForThemesDTOS = new java.util.ArrayList<>(List.of());

        for (Object[] rawDTO : rawDTOs) {
            triesForThemesDTOS.add(new TriesForThemesDTO((String) rawDTO[0], (Long) rawDTO[1]));
        }
        return triesForThemesDTOS;
    }
}
