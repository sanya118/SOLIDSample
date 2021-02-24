package com.school.student.service.validator;

import com.school.student.entities.UserInput;

public interface InputValidator {
    Boolean isInputValid(UserInput userInput);
    String getIssues();
    Boolean isInputTriggerValid(String triggerInput);
}
