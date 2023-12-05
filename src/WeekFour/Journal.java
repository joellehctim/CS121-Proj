package WeekFour;

public class Journal {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("This is i: " + i + "\n");
            for (int j = 0; j < 3; j++) {

                int[][] matrix = {
                        {11, 22, 33},
                        {45, 54, 65},
                        {67, 76, 97}
                };


                for (int k = 0; k < matrix.length; k++) {
                    System.out.println(" This is i = " + k + "\n");
                    for (int g = 0; g < matrix[i].length; g++) {
                        System.out.print("this is j =" + j);
                        System.out.println(matrix[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}









