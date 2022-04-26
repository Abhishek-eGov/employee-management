package com.example.department.model;

public class Department {
    private long id;
    private String title;

    public Department() {
    }

    public Department(long id, String title) {
        this.id = id;
        this.title = title;

    }
    public Department(String title) {
        this.title = title;

    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Tutorial [id=" + id + ", title=" + title +  "]";
    }
}
