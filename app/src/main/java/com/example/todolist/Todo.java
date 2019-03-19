package com.example.todolist;

public class Todo {

    private String description;
    private String date;

    public Todo(String descriptionV, String dateV) {
        this.description = descriptionV;
        this.date = dateV;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(String date) {
        this.date = date;
    }


}
