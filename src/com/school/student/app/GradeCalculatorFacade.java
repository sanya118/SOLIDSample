package com.school.student.app;

import com.school.student.entities.*;
import com.school.student.service.grading.*;
import com.school.student.service.io.*;
import com.school.student.service.validator.*;

import java.util.Scanner;

public class GradeCalculatorFacade {
    Scanner scanner;
    public void orchest() throws Exception {
        scanner=new Scanner(System.in);
        Boolean isInputNeeded;
        InputTrigger inputTrigger=new InputTriggerImpl();
        Input input;
        InputValidator inputValidator;
        do
        {
            input = new InputImpl();
            UserInput userInput = input.getInput();

            inputValidator = new InputValidatorImpl();
            if (inputValidator.isInputValid(userInput))
            {
                GradeCalculator gradeCalculation = new GradeCalculatorImpl();
                char grade = gradeCalculation.calculateGrade(userInput.getMarks());
                Output output = new OutputImpl();
                output.printOutput(userInput, grade);
            }
            else
                {
                throw new Exception(inputValidator.getIssues());
                }

            String inputTriggerString=input.InputNeeded();
            if(inputValidator.isInputTriggerValid(inputTriggerString)){
                isInputNeeded=inputTrigger.continueInput(inputTriggerString);
            }
            else
            {
                isInputNeeded=false;
            }
        }while(isInputNeeded);

    }
}
