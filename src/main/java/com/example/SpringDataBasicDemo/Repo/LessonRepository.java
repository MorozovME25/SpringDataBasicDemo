package com.example.SpringDataBasicDemo.Repo;

import com.example.SpringDataBasicDemo.Domains.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, Integer> {
}
