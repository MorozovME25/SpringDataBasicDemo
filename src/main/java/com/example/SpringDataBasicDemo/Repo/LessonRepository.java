package com.example.SpringDataBasicDemo.Repo;

import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component
public interface LessonRepository {
     Set<Integer> getThemesIdsByLessonId (Integer lessonId);
     List<Object[]> getLessonThemeOrderedByLessonId (Integer lessonId, Set<Integer> titlesId);
}
