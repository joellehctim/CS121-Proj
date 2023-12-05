package WeekFive;
import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileWriterDemo {
    public static void main(String[] args) {
        File outputFile = new File("myCourse.txt");
        //PrintWriter output = new PrintWriter(outputFile);

        String course, credits, score;//
        // output.printf("%s %s %s\n", "Course", "Credits", "Score");
        for (int i = 1; i <= 3; i++)
        {
            course = JOptionPane.showInputDialog(String.format("Enter Course name %d", i));
            credits = JOptionPane.showInputDialog(String.format("Enter Course credits %d", i));
           score = JOptionPane.showInputDialog(String.format("Enter Course Score %d", i));
           //output.printf("%s %s %s\n", course, credits, score);


        }
      //  output.close();
    }
}