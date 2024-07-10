package com.example.SpringDataBasicDemo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private int tutor_id;
    private boolean result;
    private String execution_time;
    private String date;

    public int getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public int getTutor_id() {
        return tutor_id;
    }
    public void setTutor_id(int tutor_id) {
        this.tutor_id = tutor_id;
    }
    public boolean isResult() {
        return result;
    }
    public void setResult(boolean result) {
        this.result = result;
    }
    public String getExecution_time() {
        return execution_time;
    }
    public void setExecution_time(String execution_time) {
        this.execution_time = execution_time;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
}