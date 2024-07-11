package com.example.SpringDataBasicDemo.Domains;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Theme extends BaseEntity{
    private String title;
    private String description;
    private String pointsFromRules;

    public Theme(String title, String description, String pointsFromRules) {
        this.title = title;
        this.description = description;
        this.pointsFromRules = pointsFromRules;
    }

    protected Theme(){}

    @OneToMany(mappedBy = "themes", targetEntity = LessonTheme.class,
            fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<LessonTheme> lessonTheme;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getPointsFromRules() {
        return pointsFromRules;
    }
    public void setPointsFromRules(String pointsFromRules) {
        this.pointsFromRules = pointsFromRules;
    }
}