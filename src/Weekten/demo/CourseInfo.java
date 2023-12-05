package Weekten.demo;

import java.util.Scanner;

public class CourseInfo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter name or q to quit");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("q")) {
                break;
            }
            stringArrayList.addName(name);
            System.out.println("Enter GPA");
            double gpa = Double.parseDouble(scanner.nextLine());
            stringArrayList.addGpa(gpa);
            System.out.println("Enter Letter Grade");
            char lg = scanner.nextLine().charAt(0);
            stringArrayList.addLetterGrade(lg);
            System.out.println("Enter Score");
            int score = Integer.parseInt(scanner.nextLine());
            stringArrayList.addScore(score);

        }
            stringArrayList.displayCourseInfo();


    }
}


