package WeekSix;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileAppend {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter fileWriter = new FileWriter("OlympicMedals.txt", true);
            PrintWriter output = new PrintWriter(fileWriter);
            String country =(JOptionPane.showInputDialog("Enter Country"));
            int gmedals = Integer.parseInt(JOptionPane.showInputDialog("Enter Gold Medals"));
            int smedals = Integer.parseInt(JOptionPane.showInputDialog("Enter Silver Medals"));
            int bmedals = Integer.parseInt(JOptionPane.showInputDialog("Enter Bronze Medals"));
            output.printf("%n%-20s %-20d %-17d %-15d", country, gmedals, smedals, bmedals);
            fileWriter.close();
            output.close();

        } catch (FileNotFoundException e){

            e.printStackTrace();

        }


    }
}
