package sortingActivity;

import java.util.Scanner;

public class Sorting {
    private int [] numbs = new int[5];
    Scanner scanner = new Scanner(System.in);




    public int[] getArray(){
        System.out.print("Enter five unsorted integers. Hit Enter after each one:\n");
        for(int i = 0; i<5; i++) {
            numbs[i]= Integer.parseInt(scanner.nextLine());
        }
        return numbs;
    }
    public int [] sortArray(int[] numbs){
        int temp;
        for (int i= 0; i<numbs.length-1; i++)
        {
            for(int index= 0; index< numbs.length-i -1; index++ ){
                if (numbs[index] > numbs[index+1]){
                    temp=numbs[index];
                    numbs[index] = numbs[index+1];
                    numbs[index+1] = temp;
                }
            }

        }
        return numbs;

    }

    }


