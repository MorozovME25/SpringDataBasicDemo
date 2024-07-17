package com.example.SpringDataBasicDemo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThemeService {
    @Autowired
    private com.example.SpringDataBasicDemo.Repo.ThemeRepository themeRepository;
}
