package HashmapsActivity;

import java.util.HashMap;
import java.util.Map;

public class hashMap {

        Map<String,String> movies = new HashMap<>();



    public void addMovie(String title, String year){
        movies.put(title,year);

    }

    public void removeMovie (String title){
        movies.remove(title);
    }
    public Object getMovieYear(String title){
        Object year;
        if (movies.containsKey(title)){
            year = movies.get(title);
        } else {
            year = "Movie Not Found";
        }
        return year;
    }
    public void displayMovie(){
        movies.forEach((title, year) -> {
            System.out.printf("Movie: %s Year: %s\n", title, year);
        });

    }
}




