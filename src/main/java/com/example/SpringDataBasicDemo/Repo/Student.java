package com.example.SpringDataBasicDemo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Student extends JpaRepository<Student, Integer> {
}
