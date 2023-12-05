package linkedListActivity;
public class Main {
    public static void main(String[] args) {

        UserBooking mov1 = new UserBooking("Joem", "Jumanji", 90,"Action", "Board Games Comes to Life","AMC" );
        UserBooking mov2 = new UserBooking("JonL", "Rocky", 110, "Drama", "Small time boxer makes is big", "Regal");

        mov1.addTheater("Flix");
        mov1.addTheater("MovieTime");
        mov1.addTheater("6Cinema");
        mov1.addTheater("TheaterTime");
        mov2.addTheater("Flix");
        mov2.addTheater("MovieTime");
        mov2.addTheater("6Cinema");
        mov2.addTheater("TheaterTime");
        mov1.getUserInfo();
        mov2.getUserInfo();
        mov1.displayUserBooking();
        mov2.displayUserBooking();
        mov1.removeTheater("Flix");
        mov2.removeTheater("6Cinema");
        mov1.displayUserBooking();
        mov2.displayUserBooking();


    }
}
