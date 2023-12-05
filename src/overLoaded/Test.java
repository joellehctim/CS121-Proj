package overLoaded;

import overLoaded.packageDemo.Retail;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Retail Marshalls = new Retail("Kerry", "Indy", 15000, 10000);
        Retail Dicks = new Retail("Gerald");
        System.out.println("How many staff members does this location have?");
        Marshalls.setStaff(Integer.parseInt(scanner.nextLine()),
                Retail.getManager());
        //Marshalls.getStoreInfo();
       // Marshalls.getProfit();
        //Marshalls.getManager();



    }
}
