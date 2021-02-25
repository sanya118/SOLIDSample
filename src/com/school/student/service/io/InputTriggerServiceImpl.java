package com.school.student.service.io;

import com.school.student.Constants;

public class InputTriggerServiceImpl implements InputTriggerService {

    @Override
    public Boolean continueInput(String triggerInput) {
        Boolean isInputRequired = null;

        if (triggerInput.equalsIgnoreCase(Constants.NEXT_INPUT_REQUIRED_TRIGGER)) {
            isInputRequired = true;
        } else if (triggerInput.equalsIgnoreCase(Constants.NEXT_INPUT_NOT_REQUIRED_TRIGGER)) {
            isInputRequired = false;
        }


        return isInputRequired;
    }
}
