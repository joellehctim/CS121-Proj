package bigOActivity;

public class bigO {
    int x = 5;

    public void printOnce(int x) {
        System.out.print(x);
    }

    public void printNTimes(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print("\nPrint me!");
        }
    }

    int counter = 0;

    public void printNSquaredTimes(int n) {

        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                counter++;
                System.out.printf("\n%d:Print me!", counter);
            }
        }
    }
}

