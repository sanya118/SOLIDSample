package com.school.student.entities;

public class UserInput {
    Student student;
    Subject subject;
    Marks marks;
    public UserInput() {
        student = new Student();
        subject = new Subject();
        marks = new Marks();
    }
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Marks getMarks() {
        return marks;
    }

    public void setMarks(Marks marks) {
        this.marks = marks;
    }
}
