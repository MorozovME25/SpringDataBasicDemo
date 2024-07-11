package com.example.SpringDataBasicDemo.Repo;

import com.example.SpringDataBasicDemo.Domains.Tutor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorRepository extends JpaRepository<Tutor, Integer> {
}
