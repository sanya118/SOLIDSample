package com.school.student.service.grading;

import com.school.student.entities.Marks;

public interface GradeCalculationService {
    public char calculateGrade(Marks marks);
}
