package Project1;

import java.util.Scanner;

public class CharacterBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rounds, c1hp, c1pow, c1sp, c2hp, c2pow, c2sp;
        int c1wins =0, c2wins = 0;
        String c1name, c1move, c2name, c2move;
        String f1 ="Fighter One", f2 = "Fighter Two";

        while(true) {

            System.out.print("Enter odd number of rounds:");
            rounds = Integer.parseInt(scanner.nextLine());
            if (rounds % 2 != 0) {
                System.out.printf("\nBattle will be a best of %d", rounds);
                break;
            }else {
                System.out.println("Try again.");
            }
        }
        for(int x=1; x<=rounds; x++){
        System.out.println("\nEnter Character 1's name:");
        c1name = scanner.nextLine();
        System.out.println("Enter Character 1's move:");
        c1move = scanner.nextLine();
        System.out.println("Enter Character 1's hit points:");
        c1hp = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Character 1's power:");
        c1pow = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Character 1's speed:");
        c1sp = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter Character 2's name:");
        c2name = scanner.nextLine();
        System.out.println("Enter Character 2's move:");
        c2move = scanner.nextLine();
        System.out.println("Enter Character 2's hit points:");
        c2hp = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Character 2's power:");
        c2pow = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Character 2's speed:");
        c2sp = Integer.parseInt(scanner.nextLine());
        while(c1hp>0 && c2hp >0){
            if (c1sp > c2sp){
               c2hp -= c1pow;
               c1hp -=c2pow;
            }else{
                c1hp -=c2pow;
                c2hp -=c1pow;
            }

        }
        if (c1hp <=0){
            System.out.printf("%s wins round %d",c2name, x);
            c2wins +=1;
        } else {
            System.out.printf("%s wins round %d",c1name, x);
            c1wins +=1;
        }



        }

        System.out.printf("\n Final Score: %d - %d", c1wins, c2wins);
        if (c1wins>c2wins){
            System.out.printf("\n Winner: %s", f1);
        }else {
            System.out.printf("\n Winner: %s", f2);
        }




    }
}
