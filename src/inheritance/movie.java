package inheritance;

public class movie {
    private String title, genre;
    private int runtime;

public movie (int runtime, String title, String genre){
    this.genre = genre;
    this.runtime = runtime;
    this.title = title;}

    public int getRuntime(){
    return runtime;
}
 public String getTitle(){
    return title; }
 public String getGenre(){
    return genre;}
    public void setRuntime(int runtime){
        this.runtime =runtime;
    }
    public void setTitle(String title){
        this.title = title;}
    public void setGenre(String genre){
        this.genre =genre;
    }
}
