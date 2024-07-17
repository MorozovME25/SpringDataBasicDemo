package com.example.SpringDataBasicDemo.Repo;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudentLessonRepository {
    List<Object[]> getThemeTitlesOrderedByStudentId (Integer studentId);
}
