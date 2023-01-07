package loop;

public class ForLoop {
    public static void main(String[] args) {
        /*
        create a program that wii; print num
         */

        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }

        for (int i = 2; i <= 50; i++) {
            System.out.println(i);
        }

        for (int i = 0; i <= 1000; i++) {
            System.out.println(i);
        }
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + " apples ");
        }

        for (int i = 1; i <= 20; i++) {
            System.out.println(" apples " + "# " + i);

        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(2 + " * " + i + " = " + 2 * i);
        }
        for (int i = 1; i <= 100; i++) {
            System.out.println(100 + " * " + i + " = " + 10 * i);
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println("Java is fun");
        }
        for (int i = 0; i < 50; i++) {
            System.out.println("My name is  Nuriia");
        }
        for (int i = 10; i >= 0; i--) {
            System.out.println("The value of x is: " + i);
        }
        for (int i = 100; i >= 0; i--) {

            if (i % 2 == 0) {
                System.out.println(i + "even");

            } else {

                System.out.println(i + " - odd");
            }
            System.out.println(1 + " * " + i + " = " + 10 * i);

        }


        multiplication(9);
        addition(50);
        division(5);;

        {
            method1(10);
            method2(10);
        }

        for (int i = 1; i >= 8; i = i - 2) {
            System.out.println("The value of num is: " + i);
        }
        for (int i = 1; i <= 15; i = i + 2) {
            System.out.println("The value of num is: " + i);

        }

    }


    public static void multiplication(int number) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);

        }
    }

    public static void addition(int number) {

        for (int i = 1; i <= 5; i++) {
            System.out.println(number + " + " + i + " = " + (number + i));
        }
    }

    public static void division(double number) {

        for (double i = 1; i <= 5; i++) {
            System.out.println(number + " / " + i + " = " + (number / i));

        }

    }

    public static void method1(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            System.out.println("the number is: " + i);
            sum = sum + i;
        }
        System.out.println("The total is: " + sum);
    }



       public static void method2(int number) {
           int multiplication = 0;
           for (int i = 1; i <= number; i++) {
               System.out.println("the number is: " + i);
            multiplication = multiplication * i;

           }
           System.out.println("The total is: " + multiplication);
       }
}
