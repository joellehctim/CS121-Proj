package WeekSix;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
       // Scanner console = new Scanner(System.in);
        //console.nextLine();
        //Creating an instance of my Car Class
        Car Tesla = new Car("Tesla", "S",2022, 10 );
        Car Honda = new Car();
        Tesla.setYears(2023);
        System.out.println(Tesla.getYear());
        System.out.println(Tesla.Color);

    }
}
