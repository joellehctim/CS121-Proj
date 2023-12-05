package WeekNine;

public class MovieBookingSimulation {
    public static void main(String[] args) {
        int[][] theater = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
        String[][] movies = {{"The Shining", "2D", "20", "$12.50"},
                {"It", "2D", "10", "$10.00"},
                {"Jaws", "3D", "25", "$16.50"}};
        System.out.println("Initial Theater:");

        for (int row = 0; row < theater.length; row++) {
            for (int column = 0; column < theater[row].length; column++) {
                System.out.printf("%d", theater[row][column]);

            }
            System.out.println();
        }
        System.out.printf("\n%-14s%-14s%-14s%-14s", "Title", "3D?", "Seats", "Price");
        for (int row = 0; row < movies.length; row++) {
            System.out.println("");
            for (int column = 0; column < movies[row].length; column++) {
                System.out.printf("%-14s", movies[row][column]);
            }
            theater[1][3] = 1;
            theater[3][5] = 1;
            theater[4][2] = 1;
            theater[2][4] = 1;

        }
        System.out.println("\nSeats Available in Theater:");
        for (int row = 0; row < theater.length; row++) {
            System.out.println("");
            for (int column = 0; column < theater[row].length; column++) {
                System.out.printf("%d", theater[row][column]);

            }
        }
    }
}





