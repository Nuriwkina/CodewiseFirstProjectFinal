package array;

import java.util.Arrays;

public class ArraysToString {




    public static void main(String[] args) {
        String [] strArray1 = {"Good" , "Morning", "Everyone"};
        String [] strArray2 = {"Good" , "Morning", "Everyone"};
        String [] strArray3 = strArray1;
        System.out.println(strArray1);
        System.out.println(strArray2);
        System.out.println(strArray3);

        System.out.println(strArray1);
        System.out.println(Arrays.toString(strArray1));


        int [] intArray = {1,2,3,4,5,6,7,8,9,0};
        String str = Arrays.toString(intArray);
        System.out.println(str);



        int [] values = {2,5,9};
        System.out.println(Arrays.toString(values));

        byte [] values1 = { 1,2,3,4,5};
        System.out.println(Arrays.toString(values1));

        boolean [] values2 = {true};
        System.out.println(Arrays.toString(values2));

        String [] values3 = {"Hello"};
        System.out.println(Arrays.toString(values3));


    }
}
