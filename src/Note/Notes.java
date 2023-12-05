package Note;

import java.util.Random;

public class Notes {
    public static void main(String[] args) {

        int n = 7;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }


    double value = Math.random();
    //int randomInt = rand.nextInt(10);
    Random rand = new Random();
    int randomInttwo = (int) (Math.random() * (50 - 1)) + 1;

}
