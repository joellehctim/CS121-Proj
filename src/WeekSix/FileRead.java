package WeekSix;


import java.io.FileNotFoundException;
import java.util.Scanner;

import java.io.File;

public class FileRead {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("OlympicMedals.txt");
        try {
            //Original code:
            //Scanner scanner = new Scanner(System.in);
            Scanner scanner = new Scanner(file); //adding the file object as what you are reading in.
            String header = scanner.nextLine();
            System.out.printf("%s\n", header);
            while (scanner.hasNextLine()) {
                String Line = scanner.nextLine();
                System.out.println(Line);
                String country = scanner.next().toUpperCase();
                int gmedals = Integer.parseInt(scanner.next());
                int smedals = Integer.parseInt(scanner.next());
                int bmedals = Integer.parseInt(scanner.next());
                System.out.printf("%n%-20s %-20d %-17d %-15d", country, gmedals, smedals, bmedals);
            }
          scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found!");
        }

    }
}