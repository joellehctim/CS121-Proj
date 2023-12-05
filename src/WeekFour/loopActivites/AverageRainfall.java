package WeekFour.loopActivites;

import java.util.Scanner;

public class AverageRainfall {
    public static void main(String[] args) {
        int years;
        int rain;
        double mave;
        int miny = 12;
        int mtrain;
        int ytrain = 0;
        int tmonths;
        int yave;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of years: ");
        years = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i<=years; i++){
            mtrain = 0;
            System.out.printf("\nYear %d", i);
            for (int m=1; m<=12; m++ ){
                System.out.printf("\nEnter rainfall for month %d: ", m);
                rain =0;
                rain = Integer.parseInt(scanner.nextLine());
                mtrain += rain;
                if (m ==12){
                    mave =((double) mtrain /miny);
                    System.out.printf("Monthly Average Rainfall: %.2f inches for year %d",mave, i);
                    ytrain += mtrain;
                }


            }


        }
        int months = (years * 12);
        yave = (ytrain/months);
        System.out.printf("\nFor the %d months, your total rainfall was %d inches." +
                "\nThere was an average rainfall of %d inches per month.",months, ytrain, yave);


    }
}
