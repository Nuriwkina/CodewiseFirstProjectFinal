package scannerClass;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int sum = a + b;
        System.out.println(sum);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number: ");

        int a1 = scanner.nextInt();

        System.out.println("Please enter second number: ");
        int b1 = scanner.nextInt();

        int sum1 = a1 + b1;
        System.out.println(a + " + " + b + " = " + sum);


















    }
}
