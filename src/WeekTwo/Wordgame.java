package WeekTwo;

import java.net.SocketOption;
import java.util.Scanner;
import java.util.Scanner;
public class Wordgame {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = keyboard.nextLine();
        System.out.println("What is your age?");
        int age = Integer.parseInt(keyboard.nextLine());
        System.out.println("What city are you from?");
        String city = keyboard.nextLine();
        System.out.println("What college do you go to?");
        String college = keyboard.nextLine();
        System.out.println("What is your favorite animal?");
        String favanimal = keyboard.nextLine();
        System.out.println("What is your major?");
        String major = keyboard.nextLine();
        System.out.println("What is your pet's name?");
        String pet = keyboard.nextLine();
        System.out.printf("There once was a person named %s who lived in %s. At the age of %d, %s went to college at %s. %s graduated with a %s degree. Then, %s adopted a(n) %s named %s. They both lived happily ever after!", name, city,age, name,college,name,major,name,favanimal,pet);


    }
}
