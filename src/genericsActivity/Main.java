package genericsActivity;
import java.sql.SQLOutput;
public class Main {
    public static void main(String[] args) {

        genericMethods gen = new genericMethods();
        Integer[] intarray= {1,2,3};
        String[] stringarray = {"Joe", "Jon", "Jen"};
        Double[] doublearray = {2.5, 3.2, 4.1};
        Character[] chararray = {'A', 'B','C'};
        System.out.print("Integer Array: ");
        gen.printarray(intarray);
        System.out.print("String Array: ");
        gen.printarray(stringarray);
        System.out.print("Double Array: ");
        gen.printarray(doublearray);
        System.out.print("Character Array: ");
        gen.printarray(chararray);





    }
}
