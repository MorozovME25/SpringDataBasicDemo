package com.example.SpringDataBasicDemo.Domains;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "students")
public class Student extends BaseEntity{
    private String name;
    private char category;
    private Set<Exam> exams;
    private Set<StudentLesson> studentLessons;

    public Student(String name, char category, Set<Exam> exams, Set<StudentLesson> studentLessons) {
        this.name = name;
        this.category = category;
        this.exams = exams;
        this.studentLessons = studentLessons;
    }

    protected Student() {}

    @OneToMany(mappedBy = "student", targetEntity = Exam.class,
            fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    public Set<Exam> getExams() {
        return exams;
    }

    public void setExams(Set<Exam> exams) {
        this.exams = exams;
    }

    @OneToMany(mappedBy = "student", targetEntity = StudentLesson.class,
            fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    public Set<StudentLesson> getStudentLessons() {
        return studentLessons;
    }

    public void setStudentLessons(Set<StudentLesson> studentLessons) {
        this.studentLessons = studentLessons;
    }
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
