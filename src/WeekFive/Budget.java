package WeekFive;

import java.util.Scanner;

public class Budget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your monthly budget?");
        int mbudget = Integer.parseInt(scanner.nextLine());
        int texpense = 0;
        while(true){
            System.out.println("Enter an expense( or enter q if finished: ");
            String input = scanner.nextLine();
            if (input.equals("q")){
                break;
            }
            texpense += Integer.parseInt(input);

        }
        int net = mbudget - texpense;
        String overorunder;
        if (net >= 0){
            overorunder = "under";
        }
        else{
            overorunder = "over";
            net *= -1;
        }

        System.out.printf("Budget: %d\n" +
                "Total Expenses: %d\n" +
                "You are %s budget by %d\n", mbudget, texpense, overorunder, net);


    }
}
