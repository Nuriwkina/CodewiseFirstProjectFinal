package practiceMockFibonacciNum;

import javax.imageio.stream.ImageInputStream;

public class FibonacciNum {
    public static void printFibonacci(int max) {

        //create method that will print fibonacci num:
        //0112

        int a = 0;
        int b = 1;
        int c = a + b;

        System.out.print(a + " " + b + " " + c + " ");


        while (c < max) {

            a = b;
            b = c;
            c = a + b;

            if (c < max) System.out.print(c + " ");
        }
    }

    public static void main(String[] args) {
        printFibonacci(50);
        System.out.println();
        printFibonacci(100);

        printFibonacci(88);
    }


    public static void printFibRecursion(int max) {


    }

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);






        }
        return 0;
    }

    public static void printFib(int max){
        int a = 0;
        int b = 1;
       int sum = a + b;

        System.out.println(a + b + sum);


        while (sum < max){
           a = b;
           b = sum;
           sum = a + b;

           if (sum < max) System.out.println(sum + " ");{


           }
        }
    }

}



