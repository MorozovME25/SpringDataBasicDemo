package com.example.SpringDataBasicDemo.Domains;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "exams")
public class Exam extends BaseEntity {
    private Tutor tutor;
    private Student student;
    private String themeResult;
    private String comment;
    private String executionTime;
    private Date date;

    public Exam(Tutor tutor, Student student, String themeResult, String comment, String executionTime, Date date) {
        this.tutor = tutor;
        this.student = student;
        this.themeResult = themeResult;
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
    @Column(name = "result")
    public String getResult() {
        return themeResult;
    }

    public void setResult(String themeResult) {
        this.themeResult = themeResult;
    }
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