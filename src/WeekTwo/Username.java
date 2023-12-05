package WeekTwo;
import java.util.Scanner;
public class Username {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your first name:");
 String fname = keyboard.nextLine();
        System.out.println("Enter your last name:");
 String lname = keyboard.nextLine();
 System.out.println(fname.toUpperCase() + " " +lname.toUpperCase());
 System.out.println(fname.toLowerCase() + " " +lname.toLowerCase());
        System.out.println(lname + " " +fname);
    }
}
