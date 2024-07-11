package com.example.SpringDataBasicDemo.Repo;

import com.example.SpringDataBasicDemo.Domains.Theme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ThemeRepository extends JpaRepository<Theme, Integer> {
}
