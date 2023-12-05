package Weekten.demo;

import java.util.ArrayList;

public class arrayListTester {
    public static void main(String[] args) {
        stringArrayList test = new stringArrayList();
        test.addName("Toby");
        test.addScore(100);
        test.addGpa(4.0);
        test.addLetterGrade('A');
        test.addName("Koby");
        test.addScore(50);
        test.addGpa(2.0);
        test.addLetterGrade('F');



        test.getScoresSize();
        test.getNamesSize();
        test.getGpaSize();
        test.getLetterGradeSize();


        test.displayCourseInfo();

        test.getName(0);
        test.getScore(0);
        test.getGpa(0);
        test.getLetterGrade(0);

        test.removeGpa(4.0);
        test.removeName("Toby");
        test.removeScore(100);
        test.removeLetterGrade('A');
        test.displayCourseInfo();








    }
}
