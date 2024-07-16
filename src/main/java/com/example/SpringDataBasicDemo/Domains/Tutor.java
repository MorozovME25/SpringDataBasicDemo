package com.example.SpringDataBasicDemo.Domains;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "tutors")
public class Tutor extends BaseEntity{
    private String name;
    private int workExperience;
    private Set<Exam> exams;

    public Tutor(String name, int workExperience, Set<Exam> exams) {
        this.name = name;
        this.workExperience = workExperience;
        this.exams = exams;
    }
    protected Tutor(){}

    @OneToMany(mappedBy = "tutor", targetEntity = Exam.class,
            fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    public Set<Exam> getExams() {
        return exams;
    }

    public void setExams(Set<Exam> exams) {
        this.exams = exams;
    }
    @Column(name = "name")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Column(name = "work_experience")
    public int getWorkExperience() {
        return workExperience;
    }
    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }
}