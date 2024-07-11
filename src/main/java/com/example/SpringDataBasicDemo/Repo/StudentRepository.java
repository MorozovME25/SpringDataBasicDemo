package com.example.SpringDataBasicDemo.Repo;

import com.example.SpringDataBasicDemo.Domains.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
