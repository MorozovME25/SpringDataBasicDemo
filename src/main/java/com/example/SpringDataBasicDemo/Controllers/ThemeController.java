package com.example.SpringDataBasicDemo.Controllers;

import com.example.SpringDataBasicDemo.Services.ThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThemeController {
    @Autowired
    private ThemeService themeService;
}
