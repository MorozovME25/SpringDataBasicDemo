package com.example.SpringDataBasicDemo.DTOs;

public class LessonIDsForThemesDTO {
    public Integer lessonId;
    public String themeTitle;

    public LessonIDsForThemesDTO(Integer lessonId, String themeTitle) {
        this.lessonId = lessonId;
        this.themeTitle = themeTitle;
    }
}
