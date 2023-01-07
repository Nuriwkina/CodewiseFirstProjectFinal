package loop;

import java.util.Scanner;

public class task {
    public static void main(String[] args) {
    }

    public static void checkEvenOrOdd(int number) {

        if (number % 2 == 0) {
            for (int i = 1; i <= 30; i++) {
                System.out.println(i + ".Hi");
            }
        } else {

            for (int i = 0; i < 30; i++) {
                System.out.println((i + 1) + ". Hello");
            }


        }
    }}
