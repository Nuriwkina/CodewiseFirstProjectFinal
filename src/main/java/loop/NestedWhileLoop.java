package loop;



public class NestedWhileLoop {
    public static void main(String[] args) {

        int r = 2021;
        while (r <= 2023) {
            System.out.println("YEAR: " + r);
            r++;

            int e = 1;
            while (e <= 12) {
                System.out.println("     month: " + e);
                e++;

            }


            int n = 2000;
            while (n <= 5000) {
                System.out.println(n);

                int c = n + 1;
                while (c <= n + 49) {
                    System.out.println("  " + c);
                    c++;
                }
                n += 1000;
            }


            System.out.println("Wohoo, I'm done");
        }
        int j = 1;
        while (j <= 6) {

            int k = 1;
            while (k <= j) {

                System.out.print(j);
                k++;
            }
            System.out.println();
            j++;
        }
        int digit = 1;
        while (digit < 10) {
            System.out.print("Multiplication table for: " + digit);

            int digit2 = 1;
            while (digit2 < 10) {
                System.out.println(digit + " * " + digit2 + " = " + (digit * digit2));
                digit2++;
            }
            digit++;
        }

        for (int l = 1; l <= 10; l++) {
            System.out.println("FOR LOOPS: Multiplication table for: " + l);
            for (int k = 1; k <= 10; k++) {
                System.out.println(l + " * " + k + " = " + (l * k));
            }

        }
        int num1 = 1;

        do{
            int num2 = 1;
            if(num1 % 2 == 0){

                do{
                    System.out.println(num1);
                    num2++;

                }while (num2 <= num1);
                System.out.println();

            }else{
                System.out.println(num1 + " is odd");
            }
            num1++;
        }while (num1 <= 10);


    }
}