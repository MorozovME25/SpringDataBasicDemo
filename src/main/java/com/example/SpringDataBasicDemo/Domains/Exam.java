package com.example.SpringDataBasicDemo.Domains;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "exams")
public class Exam extends BaseEntity {
    private Tutor tutor;
    private Student student;
    private String comment;
    private Float executionTime;
    private Date date;
    private Set<Result> resultForThemes;

    public Exam(Tutor tutor, Student student, String comment, Float executionTime, Date date, Set<Result> resultForThemes) {
        this.tutor = tutor;
        this.student = student;
        this.comment = comment;
        this.executionTime = executionTime;
        this.date = date;
        this.resultForThemes = resultForThemes;
    }

    protected Exam(){}

    @ManyToOne(optional = false)
    @JoinColumn(name = "tutor_id", referencedColumnName = "id")
    public Tutor getTutor() {
        return tutor;
    }
    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    @ManyToOne(optional = false)
    @JoinColumn(name = "student_id", referencedColumnName = "id")

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @OneToMany(mappedBy = "exam", targetEntity = Result.class,
            fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    public Set<Result> getResultForThemes() {
        return resultForThemes;
    }

    public void setResultForThemes(Set<Result> resultForThemes) {
        this.resultForThemes = resultForThemes;
    }
    @Column(name = "comment")
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    @Column(name = "execution_time")
    public Float getExecutionTime() {
        return executionTime;
    }
    public void setExecutionTime(Float executionTime) {
        this.executionTime = executionTime;
    }
    @Column(name = "date")
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
}