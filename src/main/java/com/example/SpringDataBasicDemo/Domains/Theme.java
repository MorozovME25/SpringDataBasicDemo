package com.example.SpringDataBasicDemo.Domains;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "themes")
public class Theme extends BaseEntity{
    private String title;
    private String description;
    private String pointsFromRules;
    private Set<LessonTheme> lessonTheme;
    private Set<Result> examResults;

    public Theme(String title, String description, String pointsFromRules, Set<LessonTheme> lessonTheme, Set<Result> examResults) {
        this.title = title;
        this.description = description;
        this.pointsFromRules = pointsFromRules;
        this.lessonTheme = lessonTheme;
        this.examResults = examResults;
    }

    protected Theme(){}

    @OneToMany(mappedBy = "theme", targetEntity = LessonTheme.class,
            fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    public Set<LessonTheme> getLessonTheme() {
        return lessonTheme;
    }

    public void setLessonTheme(Set<LessonTheme> lessonTheme) {
        this.lessonTheme = lessonTheme;
    }
    @OneToMany(mappedBy = "theme", targetEntity = Result.class,
            fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    public Set<Result> getExamResults() {
        return examResults;
    }

    public void setExamResults(Set<Result> examResults) {
        this.examResults = examResults;
    }
    @Column(name = "title")
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    @Column(name = "description")
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    @Column(name = "points_from_rules")
    public String getPointsFromRules() {
        return pointsFromRules;
    }
    public void setPointsFromRules(String pointsFromRules) {
        this.pointsFromRules = pointsFromRules;
    }
}