package com.school.student.service.validator;

import com.school.student.Constants;
import com.school.student.entities.UserInput;

import java.util.ArrayList;

public class InputValidationServiceImpl implements InputValidationService {


    private String issues = "";

    @Override
    public Boolean isInputValid(UserInput userInput) {
        ArrayList<Double> scores = userInput.getMarks().getScore();

        for (double s : scores) {
            if (s > Constants.MARKS_UPPER_LIMIT || s < Constants.MARKS_LOWER_LIMIT) {
                issues += "\nInvalid marks entry: " + s;

                return false;
            }
        }


        return true;
    }

    public String getIssues() {

        return issues;
    }

    @Override
    public Boolean isInputTriggerValid(String triggerInput) {
        if (!(triggerInput.equalsIgnoreCase(Constants.NEXT_INPUT_NOT_REQUIRED_TRIGGER) || triggerInput.equalsIgnoreCase(Constants.NEXT_INPUT_REQUIRED_TRIGGER))) {
            issues = "Invalid input trigger! Only enter " + Constants.NEXT_INPUT_NOT_REQUIRED_TRIGGER + " or " + Constants.NEXT_INPUT_REQUIRED_TRIGGER;
            return false;
        } else
            return true;
    }
}
