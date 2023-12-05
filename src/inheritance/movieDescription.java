package inheritance;

public class movieDescription  extends movie{
    private String description;

    public movieDescription(int runtime, String title, String genre, String description){
        super(runtime, title, genre);
        this.description = description;


    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description =description;
    }
    @Override
    public String toString(){
        return String.format("Movie: %s\nGenre: %s\n Description: %s", getTitle(), getGenre(), description);
        }
    }

