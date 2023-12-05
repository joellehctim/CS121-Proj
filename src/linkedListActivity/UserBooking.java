package linkedListActivity;

import java.util.LinkedList;

public class UserBooking {
    LinkedList<String> theaterList = new LinkedList<>();
        String userName, movieTitle, genre, description, theater;
        int runTime;



    public UserBooking(String userName, String movieTitle, Integer runtime, String genre, String description, String theater)
        {
            this.userName = userName;
            this.movieTitle= movieTitle;
            this.runTime =runTime;
            this.genre = genre;
            this.description = description;
            this.theater = theater;


        }
        public void addTheater(String theater){
        theaterList.add(theater);

        }

        public void removeTheater(String theater){
        theaterList.remove(theater);
        }

        public void getUserInfo(){
        System.out.printf("\nUserName: %s"+
                    "\nMovie Title: %s\n", userName, movieTitle);

        }

        public void displayUserBooking(){
        System.out.println(theaterList);
        }

    }



