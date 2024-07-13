package com.example.SpringDataBasicDemo.Domains;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "lesson")
public class Lesson extends BaseEntity {
    private int tasksQuantity;
    private String task;

    @OneToMany(mappedBy = "student", targetEntity = StudentLesson.class,
            fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<StudentLesson> studentLessons;

    @OneToMany(mappedBy = "lesson", targetEntity = LessonTheme.class,
            fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<LessonTheme> lessonTheme;

    public Lesson(int TasksQuantity, String task, String difficulty) {
        this.tasksQuantity = TasksQuantity;
        this.task = task;
    }
    protected Lesson(){}
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
