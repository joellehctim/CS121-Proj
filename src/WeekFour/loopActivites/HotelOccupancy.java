package WeekFour.loopActivites;
import java.util.Scanner;

public class HotelOccupancy {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int totalRooms = 0;
        int occu = 0;
        int floors ;
        int vrooms;
        double occurate;
      System.out.println("How many floors are there? : ");
        floors = Integer.parseInt(keyboard.nextLine());
        for(int i = 1; i <= floors; i++)
        {
            System.out.printf("Floor %d \n", i);
            System.out.println("How many rooms are on this floor?");
            int rooms = Integer.parseInt(keyboard.nextLine());
            totalRooms = totalRooms + rooms;
            // totalRooms += rooms
            //sum((Integer.parseInt(keyboard.nextLine())) + floors);
            System.out.println("How many rooms are occupied on this floor");
            int occuroom = Integer.parseInt(keyboard.nextLine());
            occu = occu + occuroom;

        }
        vrooms = totalRooms - occu;
        occurate = (double)occu/totalRooms;

        System.out.printf("Floors: %d \n Rooms: %d \n Occupied Rooms: %d \n Vacant Rooms: %d \n Occupancy: %.2f", floors, totalRooms, occu, vrooms, occurate);




        }
        }


