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
    private String executionTime;
    private Date date;

    public Exam(Tutor tutor, Student student, String themeResult, String comment, String executionTime, Date date) {
        this.tutor = tutor;
        this.student = student;
        this.comment = comment;
        this.executionTime = executionTime;
        this.date = date;
    }

    protected Exam(){}

    @ManyToOne(optional = false)
    @JoinColumn(name = "tutor_id", referencedColumnName = "id")
    public Tutor getTutorId() {
        return tutor;
    }
    public void setTutorId(Tutor tutor) {
        this.tutor = tutor;
    }
    @ManyToOne(optional = false)
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    public Student getStudentId(){
        return student;
    }
    public void setStudentId(Student student){
        this.student = student;
    }

    @OneToMany(mappedBy = "exam", targetEntity = Result.class,
            fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Result> resultForThemes;
    @Column(name = "comment")
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    @Column(name = "execution_time")
    public String getExecutionTime() {
        return executionTime;
    }
    public void setExecutionTime(String executionTime) {
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