package inheritance;

public class seatCategory extends movie{
    private String seat;

    public seatCategory(int runtime, String title, String genre, String seat){
        super(runtime, title, genre);
        this.seat = seat;}
    public String getSeat(){
        return seat;
    }
    public void setSeat(String seat){
        this.seat =seat;
    }
    @Override
    public String toString(){
        return String.format("Movie: %s\nGenre: %s\n Seat Category: %s", getTitle(), getGenre(),seat);
    }
}
