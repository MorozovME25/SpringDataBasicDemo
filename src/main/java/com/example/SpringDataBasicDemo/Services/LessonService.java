package com.example.SpringDataBasicDemo.Services;

import com.example.SpringDataBasicDemo.DTOs.LessonIDsForThemesDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class LessonService {
    @Autowired
    private com.example.SpringDataBasicDemo.Repo.LessonRepository lessonRepository;

    public Set<Integer> getThemesIdsByLessonId (Integer lessonId){
        return lessonRepository.getThemesIdsByLessonId(lessonId);
    }
    public List<LessonIDsForThemesDTO> getRecommendedLessonsByLessonId (Integer lessonId) {
        Set<Integer> titleIds = getThemesIdsByLessonId(lessonId);
        List<Object[]> rawDTOs = lessonRepository.getLessonThemeOrderedByLessonId(lessonId, titleIds);
        List<LessonIDsForThemesDTO> lessonIDsForThemesDTOS = new java.util.ArrayList<>(List.of());

        for (Object[] rawDTO : rawDTOs) {
            lessonIDsForThemesDTOS.add(new LessonIDsForThemesDTO((Integer) rawDTO[0], (String) rawDTO[1]));
        }
        return lessonIDsForThemesDTOS;
    }
}
