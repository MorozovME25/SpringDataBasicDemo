package com.example.SpringDataBasicDemo.Repo;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.List;

@Component
public interface ExamRepository {
    String getCommentByExamId (Integer examId);

    List<Object[]> getThemeResultsByExamId (Integer examId);

    List<String> getThemesOrderedByExamResults (Timestamp date1, Timestamp date2);
}