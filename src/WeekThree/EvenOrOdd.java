package WeekThree;
import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = Integer.parseInt(keyboard.nextLine());
        if(num % 2 == 0){
            System.out.println("Number is even");}
        else{
            System.out.print("Number is Odd");
        }

    }
}
