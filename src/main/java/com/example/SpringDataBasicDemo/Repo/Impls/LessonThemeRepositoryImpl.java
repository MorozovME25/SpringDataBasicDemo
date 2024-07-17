package com.example.SpringDataBasicDemo.Repo.Impls;

import com.example.SpringDataBasicDemo.Domains.LessonTheme;
import com.example.SpringDataBasicDemo.Repo.LessonThemeRepository;
import org.springframework.stereotype.Repository;

@Repository
public class LessonThemeRepositoryImpl extends BaseRepo<LessonTheme> implements LessonThemeRepository {
}

