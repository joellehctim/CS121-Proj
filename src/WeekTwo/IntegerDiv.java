package WeekTwo;
import java.util.Scanner;

import java.net.SocketOption;

public class IntegerDiv {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name?");
        String firstname = keyboard.nextLine();
        System.out.println("What is your age?");
        int age = Integer.parseInt(keyboard.nextLine());
        System.out.println(age);
        System.out.println(firstname);
        System.out.println("What is your Gpa?");
        double gpa =Double.parseDouble(keyboard.nextLine());
        System.out.println(gpa);
        int numOne = 1;
        int numTwo = 4;
        double results = (double)numOne/numTwo;
        System.out.println(results);
        double result = (double)(numOne/numTwo);
        System.out.println(result);





    }

}