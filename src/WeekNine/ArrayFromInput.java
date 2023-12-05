package WeekNine;

import java.util.Scanner;

public class ArrayFromInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] students = new String[3];
        String [] grades = new String [3];
        int[] testScore = new int [3];
        for (int i = 0; i<3;i++){
            System.out.println("Enter Student's Name:");
            students[i] = scanner.nextLine();
            System.out.println("Enter Student's Letter Grade:");
            grades[i] = scanner.nextLine();
            System.out.println("Enter Student's Test Score:");
            testScore[i] = Integer.parseInt(scanner.nextLine());



        }
        System.out.printf("\n%-14s %-10s %-15s\n","Name","Grade","Test Score");
        for (int j = 0; j< students.length; j++){
            System.out.printf("\n%-14s %-10s       %-15d", students[j],grades[j], testScore[j]);

        }

    }
}
