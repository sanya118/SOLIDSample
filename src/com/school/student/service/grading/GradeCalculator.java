package com.school.student.service.grading;

import com.school.student.entities.Marks;

public interface GradeCalculator {
    public char calculateGrade(Marks marks);
}
