package com.example.SpringDataBasicDemo.Domains;

import jakarta.persistence.*;

@Entity
@Table(name = "results")
public class Result extends BaseEntity{
    private Exam exam;
    private Theme theme;
    private boolean result;

    public Result(Exam exam, Theme theme, boolean result) {
        this.exam = exam;
        this.theme = theme;
        this.result = result;
    }
    protected Result(){}

    @ManyToOne(optional = false)
    @JoinColumn(name = "exam_id", referencedColumnName = "id")
    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    @ManyToOne(optional = false)
    @JoinColumn(name = "theme_id", referencedColumnName = "id")
    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }
    @Column(name = "result")
    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }
}
