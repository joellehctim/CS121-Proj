package WeekFour.loopActivites;
import javax.swing.*;
public class GuessingGame {
    public static void main(String[] args) {
        int number = 55;
        int guessnum = 0;
        while (true){
            guessnum += 1 ;
            String guess =  JOptionPane.showInputDialog("Guess a number between 1 and 100, or enter q to quit");
            if (guess.equals("q")){
                System.out.print("You quit! Number was 55!");
                break;
            }else{
                int num = Integer.parseInt(guess);
                if (num > number) {
                    System.out.print("Guess was too high! Try again!\n");
                } else if (num < number) {
                    System.out.print("Guess was too low! Try again!\n");
                }
                else{
                    System.out.print("Correct!");
                    break;



                }

            }


            }
        System.out.printf("You guessed %d times", guessnum);

        }
    }

