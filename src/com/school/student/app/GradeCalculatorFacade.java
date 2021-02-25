package com.school.student.app;

import com.school.student.entities.*;
import com.school.student.service.grading.*;
import com.school.student.service.io.*;
import com.school.student.service.validator.*;
import java.util.Scanner;

public class GradeCalculatorFacade {
    Scanner scanner;
    public void orchest() {
        try {
            scanner = new Scanner(System.in);
            Boolean isInputNeeded;
            InputTriggerService inputTriggerService = new InputTriggerServiceImpl();
            InputService inputService;
            InputValidationService inputValidationService;
            do {
                inputService = new InputServiceImpl();
                UserInput userInput = inputService.getInput();

                inputValidationService = new InputValidationServiceImpl();
                if (inputValidationService.isInputValid(userInput)) {
                    GradeCalculationService gradeCalculation = new GradeCalculationServiceImpl();
                    char grade = gradeCalculation.calculateGrade(userInput.getMarks());
                    OutputService output = new OutputServiceImpl();
                    output.printOutput(userInput, grade);
                } else {
                    throw new Exception(inputValidationService.getIssues());
                }

                String inputTriggerString = inputService.inputNeeded();
                if (inputValidationService.isInputTriggerValid(inputTriggerString)) {
                    isInputNeeded = inputTriggerService.continueInput(inputTriggerString);
                } else {
                    isInputNeeded = false;
                }
            } while (isInputNeeded);

        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
