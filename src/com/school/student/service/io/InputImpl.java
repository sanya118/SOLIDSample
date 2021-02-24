package com.school.student.service.io;

import com.school.student.entities.Marks;
import com.school.student.entities.UserInput;

import java.util.ArrayList;
import java.util.Scanner;

public class InputImpl implements Input {
    private Scanner scanner;
    @Override
    public UserInput getInput() {

            UserInput userinput = new UserInput();
            scanner = new Scanner(System.in);
            System.out.println("Enter marks:");
            ArrayList<Double> scores = new ArrayList<>();
            String i = scanner.nextLine();
            String[] temp = i.split(" ");
        for (String s : temp) {
            scores.add(Double.parseDouble(s));
        }
            Marks marks = new Marks();
            marks.setScore(scores);
            userinput.setMarks(marks);

            return userinput;

    }

    public String InputNeeded()
    {
        System.out.println("Do you want to check for someone again?(y/n)");
       String isInputNeeded=scanner.next();
       return isInputNeeded;

    }
}
