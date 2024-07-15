package com.example.SpringDataBasicDemo.Domains;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "student_lesson")
public class StudentLesson extends BaseEntity {
    private Student student;
    private Lesson lesson;
    private Float executionTime;
    private String result;

    public StudentLesson(Student student, Lesson lesson, Float executionTime, String result) {
        this.student = student;
        this.lesson = lesson;
        this.executionTime = executionTime;
        this.result = result;
    }
    @ManyToOne(optional = false)
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }
    @ManyToOne(optional = false)
    @JoinColumn(name = "lesson_id", referencedColumnName = "id")
    public Lesson getLesson() {
        return lesson;
    }
    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }
    @Column(name = "execution_time")
    public Float getExecutionTime() {
        return executionTime;
    }
    public void setExecutionTime(Float executionTime) {
        this.executionTime = executionTime;
    }
    @Column(name = "result")
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
