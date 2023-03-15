package loop;

import java.util.ArrayList;
import java.util.Scanner;

public class LoopPractice27Jan {
    public static void main(String[] args) {

        /*
        1. For Loop
         */

        for (int i = 0; i < 10; i++){
            System.out.print("A");
        }

        System.out.println("\n");

        for (int i = 10; i > 0; i--){
            System.out.println("A" + i);
        }
        System.out.println("\n");

        for (int i = 50; i >= 0; i--) {
            System.out.print(i + " ");

        }

        System.out.println("\n");

        for (int i = 0; i <= 50; i++) {
            System.out.print(i + " ");
            
        }


        System.out.println("\n WHILE LOOP ");

        /*
        2. While Loop
         */

        int i = 0;
        while (i <= 50){
            System.out.print(i + " ");
            i++;
        }


        int j = 50;
        while (j >=0){
            System.out.print(j);
            j--;
        }

        System.out.println("DO WHILE LOOP");

        int k = 0;
        do {
            System.out.print("t");
            k++;
        }
        while (k < 50);


        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(3456778);
        numList.add(908976);
        numList.add(456799);
        numList.add(555555);
        numList.add(455566);
        numList.add(5567788);
        numList.add(999999);

        for (int num : numList) {
            if (num == 999999){
                System.out.println(num);
            }

        }


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("please input num: ");
//        int num = scanner.nextInt();
//        System.out.println(num);


        System.out.println(hourToMin(10));


    }
    public static int hourToMin(int hours){
        return hours * 60;
    }
}
