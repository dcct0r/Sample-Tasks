package com.example.sample_14.model;

public class Game {
    private String name;
    private int creationDate;

    public Game(String name, int creationDate) {
        this.name = name;
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "name = " + name +
                ", creationDate = " + creationDate;
    }
}
