package com.example.SpringDataBasicDemo.Controllers;

import com.example.SpringDataBasicDemo.Services.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResultController {
    @Autowired
    private ResultService resultService;
}
