package com.example.SpringDataBasicDemo.Domains;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "lesson")
public class Lesson extends BaseEntity {
    private int tasksQuantity;
    private String task;
    private Set<StudentLesson> studentLesson;
    private Set<LessonTheme> lessonTheme;

    public Lesson(int tasksQuantity, String task, Set<LessonTheme> lessonTheme, Set<StudentLesson> studentLessons) {
        this.tasksQuantity = tasksQuantity;
        this.task = task;
        this.lessonTheme = lessonTheme;
        this.studentLesson = studentLessons;
    }
    protected Lesson(){}

    @OneToMany(mappedBy = "lesson", targetEntity = LessonTheme.class,
            fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    public Set<LessonTheme> getLessonTheme() {
        return lessonTheme;
    }

    public void setLessonTheme(Set<LessonTheme> lessonTheme) {
        this.lessonTheme = lessonTheme;
    }

    @OneToMany(mappedBy = "lesson", targetEntity = StudentLesson.class,
            fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    public Set<StudentLesson> getStudentLesson() {
        return studentLesson;
    }

    public void setStudentLesson(Set<StudentLesson> studentLessons) {
        this.studentLesson = studentLessons;
    }

    @Column(name = "tasks_quantity")
    public int getTasksQuantity() {
        return tasksQuantity;
    }
    public void setTasksQuantity(int tasksQuantity) {
        this.tasksQuantity = tasksQuantity;
    }
    @Column(name = "task")
    public String getTask() {
        return task;
    }
    public void setTask(String task) {
        this.task = task;
    }
}
