package WeekSix;

import java.util.Scanner;

public class MethodsActivity {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] arg) {
        double length, width, area;
        length = getLength();
        width = getWidth();
        area = getArea(length,width);
        displaydata(length, width, area);
        scanner.close();
    }
    public static void displaydata(double l, double w, double a){
        System.out.printf("Rectangle Length: %.1f%nRectangle Width: %.1f%nRectangle Area: %.1f%n", l,w,a);

    }
    public static double getArea(double l, double w){
        double area = l*w;
        return area;
    }
    public static double getLength(){
        System.out.println("Enter length:\n");
        double length = Double.parseDouble(scanner.nextLine());
        return length;
    }
    public static double getWidth() {
        System.out.println("Enter width:\n");
        double width = Double.parseDouble(scanner.nextLine());
        return width;
    }

}
