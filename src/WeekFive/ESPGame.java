package WeekFive;
import java.util.Random;
import java.util.Scanner;

public class ESPGame {
    public static void main(String[] args) {
        Random random = new Random();
        String Color;
        Scanner scanner = new Scanner(System.in);
        System.out.println("The computer will choose a color between red, green, blue, yellow, and orange.\n Try to guess what color!");
        String guess;
        int Correct = 0;
        for (int i = 1; i<=10; i++){
            int number = random.nextInt(5);
            System.out.printf("\nThe computer has chosen the color number %d." +"\nEnter your guess:",i);
            guess = scanner.nextLine().toUpperCase();
            if (number == 0) {
                Color = "RED";
            }else if (number == 1){
               Color = "YELLOW" ;
            }else if (number == 2) {
                Color = "GREEN";
            }else if (number == 3) {
                Color = "BLUE";
            }else{
                Color = "ORANGE";
            }
            if (guess.equals(Color)){
                Correct += 1;
                System.out.println("Correct!");
            }else{
                System.out.println("Incorrect!");
            }
            System.out.printf("The computer guessed %s", Color);
        }
        System.out.printf("\nYou got %d right!",Correct);

    }
}
