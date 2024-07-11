package com.example.SpringDataBasicDemo.Domains;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "students")
public class Student extends BaseEntity{
    private String name;
    private char category;

    @OneToMany(mappedBy = "student", targetEntity = Exam.class,
            fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Exam> exams;

    @OneToMany(mappedBy = "student", targetEntity = StudentLesson.class,
            fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<StudentLesson> studentLessons;

    public Student(String name, char category, int ExamID) {
        this.name = name;
        this.category = category;
    }
    protected Student() {}
    @Column(name = "name")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Column(name = "category")
    public char getCategory() {
        return category;
    }
    public void setCategory(char category) {
        this.category = category;
    }
}
