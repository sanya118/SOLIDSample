package com.school.student.service.io;

import com.school.student.Constants;
import com.school.student.entities.Marks;
import com.school.student.entities.UserInput;

import java.util.ArrayList;
import java.util.Scanner;

public class InputServiceImpl implements InputService {
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

    public String inputNeeded()
    {
        System.out.println("Do you want to check for someone again?("+ Constants.NEXT_INPUT_REQUIRED_TRIGGER +"/"+Constants.NEXT_INPUT_NOT_REQUIRED_TRIGGER+")");
       String isInputNeeded=scanner.next();
       return isInputNeeded;

    }
}
