package com.school.student.entities;

public class Student {
    String name;
    int rollno;
Student(){
    name="Sanya";
    rollno=13;
}
    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
