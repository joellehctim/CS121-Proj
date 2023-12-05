package WeekFive;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileAppend {
    public static void main(String[] args) throws IOException {
        try{
            FileWriter filewriter = new FileWriter("/Users/joemitchell/Desktop/CS121 Proj/src/Note/courses.txt", true);
            PrintWriter output = new PrintWriter(filewriter);
            String course = JOptionPane.showInputDialog("Enter Course Name");
            String credits = JOptionPane.showInputDialog("Enter Course Credits");
            String score = JOptionPane.showInputDialog("Enter Course Score");

            output.printf("%n%s %s %s", course, credits, score);

            filewriter.close();
            output.close();

        } catch(FileNotFoundException e){
            System.err.println("File Issue");

        }
    }
}
