package com.cs440;

public class Meal {
    private String name;
    private int calories;
    private String description;

    public Meal(String name, int calories, String description) {
        this.name = name;
        this.calories = calories;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public String getDescription() {
        return description;
    }

    
}