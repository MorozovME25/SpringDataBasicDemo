package com.example.SpringDataBasicDemo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TutorService {
    @Autowired
    private com.example.SpringDataBasicDemo.Repo.TutorRepository tutorRepository;
}
