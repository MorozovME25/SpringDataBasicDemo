package com.example.SpringDataBasicDemo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Lesson extends JpaRepository<Lesson, Integer> {
}
