package com.school.student;

import com.school.student.app.GradeCalculatorFacade;

public class Main {

    public static void main(String[] args) {
        GradeCalculatorFacade gradeCalculatorFacade=new GradeCalculatorFacade();
        try {
            gradeCalculatorFacade.orchest();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
