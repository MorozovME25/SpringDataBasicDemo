package com.example.SpringDataBasicDemo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private char category;
    private int exam_id;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public char getCategory() {
        return category;
    }
    public void setCategory(char category) {
        this.category = category;
    }
    public int getExam_id() {
        return exam_id;
    }
    public void setExam_id(int exam_id) {
        this.exam_id = exam_id;
    }
}
