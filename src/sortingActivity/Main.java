package sortingActivity;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sorting sorting = new Sorting();

        int[] array = sorting.getArray();

        System.out.println("Unsorted Array:\n");
        System.out.println(Arrays.toString(array));

        int[] sortedArray = sorting.sortArray(array);
        System.out.println(Arrays.toString(sortedArray));


    }
}


