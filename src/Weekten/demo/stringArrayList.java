package Weekten.demo;

import java.util.ArrayList;

public class stringArrayList {
    private static ArrayList<String> names = new ArrayList<>();
    private static ArrayList<Integer> scores = new ArrayList<>();
    private static ArrayList<Double> gpas = new ArrayList<>();
    private static ArrayList<Character> letterGrade = new ArrayList<>();

    public int getScoresSize() {
        return scores.size();
    }

    public void removeScore(int score) {
        scores.remove(Integer.valueOf(score));
    }

    public static void addScore(int score) {
        scores.add(score);
    }

    public int getScore(int index) {
        return scores.get(index);

    }


    //
    public int getNamesSize() {
        return names.size();
    }

    public void removeName(String name) {
        names.remove(name);
    }

    public static void addName(String name) {
        names.add(name);
    }

    public String getName(int index) {
        return names.get(index);

    }


    //
    public int getGpaSize() {
        return gpas.size();
    }

    public void removeGpa(double gpa) {
        gpas.remove(gpa);
    }

    public static void addGpa(double gpa) {
        gpas.add(gpa);
    }

    public Double getGpa(int index) {
        return gpas.get(index);

    }


    public int getLetterGradeSize() {
        return letterGrade.size();
    }

    public void removeLetterGrade(Character grade) {
        letterGrade.remove(grade);
    }

    public static void addLetterGrade(Character grade) {
        letterGrade.add(grade);
    }

    public Character getLetterGrade(int index) {
        return letterGrade.get(index);

    }

    public static void displayCourseInfo() {
        System.out.printf("%-10s%-10s%-10s%-10s%n", "Name", "Score", "GPA", "Letter Grade");
        for (int i = 0; i < names.size(); i++) {
            System.out.printf("%-10s%-10d%-10.2f%-10s%n", names.get(i), scores.get(i), gpas.get(i), letterGrade.get(i));
        }
    }
}
            /*
    public void displayLetterGrade1() {
        System.out.printf("Grades:%n");
        for (Object s : letterGrade) {

            System.out.printf("%s%n", s);
        }

    }

    public void displayLetterGrade2() {
        System.out.printf("Grade:%n");
        for (int i = 0; i < letterGrade.size(); i++) {

            System.out.printf("%s%n", letterGrade.get(i));
        }
    }
}



    public void displayScore1() {
        System.out.printf("Scores:%n");
        for (Object s : scores) {

            System.out.printf("%d%n", s);
        }

    }

    public void displayScore2() {
        System.out.printf("Scores:%n");
        for (int i = 0; i < scores.size(); i++) {

            System.out.printf("%d%n", scores.get(i));
        }


 public void displayGpa1() {
        System.out.printf("GPAs:%n");
        for (Object s : gpas) {

            System.out.printf("%.1f%n", s);
        }

    }

    public void displayGpas2() {
        System.out.printf("GPAs:%n");
        for (int i = 0; i < gpas.size(); i++) {

            System.out.printf("%.1f%n", gpas.get(i));
        }

    }

 public void displayNames1() {
        System.out.printf("Names:%n");
        for (Object s : names) {

            System.out.printf("%s%n", s);
        }

    }

    public void displayNames2() {
        System.out.printf("Names:%n");
        for (int i = 0; i < names.size(); i++) {

            System.out.printf("%s%n", names.get(i));
        }


    }
*/


