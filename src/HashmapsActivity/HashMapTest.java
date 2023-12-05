package HashmapsActivity;

public class HashMapTest {
    public static void main(String[] args) {
        hashMap movies = new hashMap();
        movies.addMovie("Jumanji", "1995");
        movies.addMovie("Rocky", "1976");
        movies.addMovie("Alien" ,"1979");


        movies.displayMovie();

       System.out.println(movies.getMovieYear("Jumanji"));
       movies.removeMovie("Rocky");
       System.out.println(movies.getMovieYear("Rocky"));

       movies.displayMovie();
    }
}
