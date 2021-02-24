package com.school.student.service.grading;

import com.school.student.entities.Grade;
import com.school.student.entities.Marks;

public class GradeCalculatorImpl implements GradeCalculator {
    @Override
    public char calculateGrade(Marks marks) {
        char grade;

        double average=0.0;
        double sum=0.0;
        for(int i=0;i<marks.getScore().size();i++){
            sum+=marks.getScore().get(i);
        }
        average=sum/marks.getScore().size();

        if(average>90){
            grade= Grade.A.name().charAt(0);
        }
        else if(average>80){
            grade=Grade.B.name().charAt(0);
        }
        else if(average>70){
            grade=Grade.C.name().charAt(0);
        }
        else if(average>60){
            grade=Grade.D.name().charAt(0);
        }
        else if(average>50){
            grade=Grade.E.name().charAt(0);
        }
        else
        {
            grade='F';
        }
return grade;
    }
}
