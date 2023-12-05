package WeekThree;
import javax.swing.*;
import java.util.Scanner;
public class Triangles {
    public static void main(String[] args) {
        int sideone = Integer.parseInt(JOptionPane.showInputDialog("Enter first side"));
        int sidetwo = Integer.parseInt(JOptionPane.showInputDialog("Enter second side"));
        int sidethree = Integer.parseInt(JOptionPane.showInputDialog("Enter third side"));
        if (sideone == sidetwo){
            if (sidetwo == sidethree){
                System.out.println("Triangle is Equilateral");}
            else{
                System.out.println("Triangle is Isosceles");}}
        else if (sideone == sidethree) {
            System.out.println("Triangle is Isosceles");}
        else if (sidetwo == sidethree){
            System.out.println("Triangle is Isosceles");}
        else {
            System.out.println("Triangle is Scalene");}
        }


    }

