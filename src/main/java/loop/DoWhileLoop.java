package loop;
public class DoWhileLoop {
    public static void main(String[] args) {

        String text = "Hello";
        boolean b = true;

        while (b) {
            System.out.println(text);
            b = false;
        }
        //================

        do {
            System.out.println(text);
        } while (b);


        //================

        int a = 5;

        do {
            System.out.println(a + " hello");
            a--;
        } while (a > 0);

        //===================
        int v = 5;

        while (v >= 0) {
            System.out.println(v + " hello");
            v--;
        }
        /*
        write a program that prints
        numbers from 100 to 1
        in the end print the sum of all numbers

        if number divisible by 5: number divisible by if number is divisible by 5 and its not even:
        weird number
        if number is even: print number even
        if number is not divisible by 5 and its odd: odd number

        100 divisible by 5
        99
        98 even
        97
        96 even
        95 weird number

        The sum of all numbers: 5050
         */

        int t = 100;
        int sum = 0;

        while(t >= 1){
            if (t % 5 == 0){
                System.out.println(t + " divisible by 5");
                if (t % 2 != 0){
                    System.out.println(t + " weird number");

                }
            }else{
                if (t % 2 != 0){
                    System.out.println(t + " odd number");
                }
            }
            if (t % 2 == 0){
                System.out.println(t + " even number");
            }
            sum+=t;
            t--;
        }
        System.out.println(sum);
        }

}


