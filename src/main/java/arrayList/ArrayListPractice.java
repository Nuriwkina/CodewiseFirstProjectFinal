package arrayList;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        /*
        contain (element) it will return boolean
        true if contains, folse if doesnot contain
         */


         /*
        into evenNumbers, add even numbers from 0 to 20
         */
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
        }
        /*
       create arrayList if Integers,  and put numbers divisible by 3 in a range from 0 to 100
         */
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                numbers.add(i);
            }
        }
        System.out.println(numbers);







        ArrayList<String> apples = new ArrayList<>();
        apples.add("1 apple");
        for (int i = 2; i <= 100; i++) {
        if (i % 10 != 0) ;
        apples.add(i + "apples");
    }
}
/*
        System.out.println(apples);
        for (int j = 1000; j <= 1100; j++){
            if (j % 2 != 0){
                apples.add(j+ " apples");
            }
        }
        for(int k =0;k<apples.size();k++)
            System.out.println(apples.get(k));

 */
    }




