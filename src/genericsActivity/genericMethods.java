package genericsActivity;

public class genericMethods {

    public <E> void printarray(E[] inputArray){
        for (E element : inputArray){
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}
