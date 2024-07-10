package com.example.SpringDataBasicDemo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Exam extends JpaRepository<Exam, Integer> {
}
