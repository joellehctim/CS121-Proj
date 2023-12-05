package WeekThree;
import java.util.Scanner;
public class RestaurantSelector {
    public static void main(String[] args) {
        String Joes = "Joe's Gourmet Burgers";
        String Main = "Main Street Pizza Company";
        String Corner = "Corner Café";
        String Mamas = "Mama's Fine Italian";
        String Chef = "The Chef's Kitchen";
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Are you vegetarian? :");
        String vege = keyboard.nextLine().toLowerCase();
        System.out.println("Are you vegan? :");
        String vegan = keyboard.nextLine().toLowerCase();
        System.out.println("Are you gluten-free? :");
        String glute = keyboard.nextLine().toLowerCase();
        System.out.println("Your Restaurant Choices are :");

        if(vege.equals("yes") && vegan.equals("yes") && glute.equals("yes")){
            System.out.println(Chef + "\n"+ Corner);}
        else if(vege.equals("yes") && vegan.equals("yes") && glute.equals("no")){
            System.out.println(Chef + "\n"+ Corner);}
        else if(vege.equals("yes") && vegan.equals("no") && glute.equals("no")){
            System.out.println(Chef + "\n"+ Corner + "\n" + Mamas + "\n" + Main);}
        else if(vege.equals("yes") && vegan.equals("no") && glute.equals("yes")){
            System.out.println(Chef + "\n"+ Corner +  "\n" + Main);}
        else if(vege.equals("no") && vegan.equals("no") && glute.equals("no")){
            System.out.println(Chef + "\n"+ Corner +  "\n" + Main + "\n" + Joes + "\n" + Mamas);}
        else if(vege.equals("no") && vegan.equals("yes") && glute.equals("no")){
            System.out.println(Chef + "\n"+ Corner) ;}
        else if(vege.equals("no") && vegan.equals("no") && glute.equals("yes")){
            System.out.println(Chef + "\n"+ Corner +  "\n" + Main) ;}






    }



    }

