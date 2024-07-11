package com.example.SpringDataBasicDemo.Domains;


import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "lesson_theme")
public class LessonTheme extends BaseEntity{
    private Lesson lesson;
    private Theme theme;

    public LessonTheme(Lesson lesson, Theme theme) {
        this.lesson = lesson;
        this.theme = theme;
    }
    @ManyToOne(optional = false)
    @JoinColumn(name = "lesson_id", referencedColumnName = "id")
    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }
    @ManyToOne(optional = false)
    @JoinColumn(name = "theme_id", referencedColumnName = "id")
    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }
}
