package org.ydmins.grade_calculator;

import java.util.List;

public class GradeCalculator {
    private final Courses courses;

    public GradeCalculator(Courses courses) {
        this.courses = courses;
    }

    public GradeCalculator(List<Course> courses) {
        this.courses = new Courses(courses);
    }

    public double calculateGrade() {
        double multipliedCreditAndCourseGrade = courses.multiplyCreditAndCourseGrade();
        int totalCompletedCredit = courses.calculateTotalCompletedCredit();
        return multipliedCreditAndCourseGrade / totalCompletedCredit;
    }
}
