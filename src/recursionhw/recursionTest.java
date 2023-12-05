package recursionhw;

import java.util.Scanner;

public class recursionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = Integer.parseInt(scanner.nextLine());
        recursion.countDown(number);
        System.out.println("\nEnter a letter:");
        char letter = scanner.next().charAt(0);
        recursion.alphaBackwords(letter);
    }





}
