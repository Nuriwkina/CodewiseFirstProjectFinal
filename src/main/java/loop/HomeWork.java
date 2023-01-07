package loop;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class HomeWork {
    public static void main(String[] args) {

        //----task-1---create a loop that prints all December days from 1 to 31:

        for (int h = 1; h <= 31; h++) {

            int sum = 0;

            System.out.println(h + " December 2022");

            sum = sum + h;
        }


        //===task-2---create a loop that prints all even numbers from 1 to 200:

        System.out.println();
        for (int h = 0; h <= 200; h++) {
            if (h % 2 == 0)

                System.out.println("even " + h);

        }
        //====task-3----create a loop that prints all odd numbers from 100 to 1:

        System.out.println();
        for (int j = 100; j >= 1; j--) {
            if (j % 2 != 0)


                System.out.println("odd " + j);
        }

        //--------task-4-------create a loop that prints all the values divisible by 7 in the range of 1 to 100 in reverse order.d division() {

        for (int a = 1; a <= 100; a++) {

            if (a % 7 == 0) {


                System.out.println(a + " - divisible");
            } else {
                System.out.println(a);
            }


        }

    }

}