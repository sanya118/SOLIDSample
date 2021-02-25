package com.school.student.service.io;

import com.school.student.entities.UserInput;

public class OutputServiceImpl implements OutputService {
    @Override
    public void printOutput(UserInput userInput, char grade) {
        System.out.println("REPORT CARD");
        System.out.println("Name:" + userInput.getStudent().getName());
        System.out.println("Subject:" + userInput.getSubject().getName());
        System.out.println("Marks:" + userInput.getMarks().getScore());
        System.out.println("Grade:" + grade);
    }
}
