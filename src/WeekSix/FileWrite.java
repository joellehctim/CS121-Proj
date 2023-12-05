package WeekSix;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite {
        public static void main(String[] args) throws IOException {
                FileWriter filewriter = new FileWriter("OlympicMedals.txt", true);
                PrintWriter output = new PrintWriter(filewriter);
               // String country = JOptionPane.showInputDialog("Enter Country");
               // String gmedals = JOptionPane.showInputDialog("Enter Gold Medals");
              //  String smedals = JOptionPane.showInputDialog("Enter Silver Medals");
              //  String bmedals = JOptionPane.showInputDialog("Enter Bronze Medals");

                output.printf("%s %s %s %s \n","<Country> ","   <Gold Medals> ","  <Silver Medals> ","   <Bronze Medals> ");
                int countries = Integer.parseInt(JOptionPane.showInputDialog("Enter amount of Countries:"));
                for (int i = 1; i <=countries;i++){
                    String country =(JOptionPane.showInputDialog("Enter Country"));
                    int gmedals = Integer.parseInt(JOptionPane.showInputDialog("Enter Gold Medals"));
                    int smedals = Integer.parseInt(JOptionPane.showInputDialog("Enter Silver Medals"));
                    int bmedals = Integer.parseInt(JOptionPane.showInputDialog("Enter Bronze Medals"));
                    output.printf("%n%-20s %-20d %-17d %-15d", country, gmedals, smedals, bmedals);

                }



                output.close();

            }
        }

