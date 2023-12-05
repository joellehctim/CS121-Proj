package WeekFive;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileIOPractice {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/joemitchell/Desktop/CS121 Proj/src/Note/courses.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String Line = scanner.nextLine();
                System.out.println(Line);
                String course = scanner.next();
                int credits = Integer.parseInt(scanner.next());
                int score = Integer.parseInt(scanner.next());
                System.out.printf("%-7s %3d %7d \n", course, credits, score);


            }

        } catch (FileNotFoundException e) {
           // e.printStackTrace();
            System.err.println("File Not Found!");

        }

    }
}