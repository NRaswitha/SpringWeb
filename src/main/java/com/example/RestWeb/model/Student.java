package com.example.RestWeb.model;

public class Student
{
    private String name;
    private String course;
    private String description;

    public Student(String name, String course, String description) {
        this.name = name;
        this.course = course;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
