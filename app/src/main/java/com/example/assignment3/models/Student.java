package com.example.assignment3.models;

public class Student {
    private String name , section ;


    public Student() {
    }
    public Student(String name, String section) {
        this.name = name;
        this.section = section;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }


}
