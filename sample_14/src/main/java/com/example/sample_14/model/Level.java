package com.example.sample_14.model;

public class Level {
    private String complexity, levelName;

    public Level(String complexity, String levelName) {
        this.complexity = complexity;
        this.levelName = levelName;
    }

    @Override
    public String toString() {
        return "complexity = " + complexity +
                ", levelName = " + levelName;
    }
}
