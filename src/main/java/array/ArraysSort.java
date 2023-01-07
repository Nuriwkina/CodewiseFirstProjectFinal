package array;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ArraysSort {
    public static void main(String[] args) {

        String [] strArray = {"banana", "orange", "apple", "kiwi"};
        Arrays.sort(strArray); // this sorts array in ascending order
        System.out.println(Arrays.toString(strArray)); // apple, banana, kiwi, orange

        double [] doubleArr = new double [] {3, 7.5, 7.1, 9, 0, 3.12};
        System.out.println("original:" + Arrays.toString(doubleArr));
        Arrays.sort(doubleArr);
        System.out.println("sorted: " + Arrays.toString(doubleArr));


        //create 9 arrays, print them, sort them and again print values

        int [] intArray = {1,2,3,4,5,6,7,8};
        System.out.println("original: " + Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println("sorted: " + Arrays.toString(intArray));

        long [] longsArr = {11235454,2143546,84568765};
        System.out.println("original; " + Arrays.toString(longsArr));
        Arrays.sort(longsArr);
        System.out.println("sorted: " + Arrays.toString(longsArr));

        boolean [] booleansArr = {false};
        System.out.println("original: " + Arrays.toString(booleansArr));

    }
}
