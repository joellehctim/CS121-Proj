package WeekFour.loopActivites;

import java.util.Scanner;

public class TestAverage {
    public static void main(String[] args) {
        int nstud;
        int ntest;
        int testsc = 0;
        double ave;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of students:");
        nstud = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter number of test the students have taken:");
        ntest = Integer.parseInt(scanner.nextLine());
        for (int i=1; i <= nstud; i++){
            System.out.printf("\nStudent number %d \n" +
                    "----------------" , i);
            for (int j=1; j<= ntest; j++){
                System.out.printf("\nEnter score for test %d :", j);
                testsc += Integer.parseInt(scanner.nextLine());

            }
            ave = (double) (testsc/ntest);
            System.out.printf("Students Average Score on %d Tests:%.2f %%", ntest, ave);


        }



    }
}
