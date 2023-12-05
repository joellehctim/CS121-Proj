package setAndIteratorActivity;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
public class MovieCollectionSet {
    Set<String> movies = new HashSet<>();
    Scanner scanner = new Scanner(System.in);
    String movie;

    public void addMovies() {
        while (true) {
            System.out.println("Enter movie or enter 0 to quit:\n");
            movie = scanner.nextLine();
            if (movie.equals("0")) {
                break;
            } else {
                movies.add(movie);
            }

        }
    }
    public void displayMovies(){
        Iterator<String> iterator = movies.iterator();
        while (iterator.hasNext()){
            String movie = (String)iterator.next();
            System.out.println(movie);

        }

    }
}
