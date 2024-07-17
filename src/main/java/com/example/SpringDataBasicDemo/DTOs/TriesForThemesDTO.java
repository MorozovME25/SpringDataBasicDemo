package com.example.SpringDataBasicDemo.DTOs;

public class TriesForThemesDTO {
    public String themeTitles;
    public Long tryCount;

    public TriesForThemesDTO(String themeTitles, Long tryCount) {
        this.themeTitles = themeTitles;
        this.tryCount = tryCount;
    }
}
