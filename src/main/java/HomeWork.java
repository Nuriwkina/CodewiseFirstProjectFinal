import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {

        byte b = 5;
        System.out.println("byte: " + b);

        int i = 55;
        System.out.println("integer: " + i);

        char a = '$';
        System.out.println("char: " + a);

        short s = 22;
        System.out.println("short: " + s);

        double d = 4.5;
        System.out.println("double: " + d);

        float f = 5.6f;
        System.out.println("float: " + f);

        long l = 121212;
        System.out.println("long: " + l);

        boolean b1 = true;
        System.out.println("boolean: " + false);


     //---------Task-2--------//

         String firstName = "Nuriia";
         String lastName = "Abdrakhmanova";

        System.out.println("My first name is: Nuriia");
        System.out.println("My last name is: Abdrakhmanova");

        //----Task-3---//

         boolean assign = true;
        System.out.println("assign is: " + assign);

        assign = false;
        System.out.println("assign is: " + assign);

        /*
         ---- Task-1---
         */

        int a1 = 100;
        int b2 = 200;
        int sum = a + b;

        System.out.println("Sum of two numbers are: " + sum);


        /*
        ---Task-2---
         */


        int q = 5;
        int w = 9;
        int e = 10;
        int sum1 = q + w + e;
        System.out.println("Sum of three numbers are: " + sum1);

        /*
        ---Task-3----
         */

      int num1 = 3;
      int num2 = 1 + 2;

        System.out.println(num2);

      int num3 = 3 - 1;
        System.out.println(num3);

      int num4 = 2 * 2;
        System.out.println(num4);

      int num5 = 4 / 2;
        System.out.println(num5);

      int num6 = 2 + 8;
        System.out.println(num6);

      int num7 = 10 % 7;
        System.out.println(num7);

          /*
       ---Task-4-----
           */

      int length = 9;
      int width = 15;
      int rectangle = (length + width) * 2;

        System.out.println("The area of a rectangle is: " + length);
        System.out.println("The perimeter of area is: " + width);
        System.out.println("The perimeter of rectangle is: " + rectangle);

            /*
        ---Task-5---
            */

            int f1 = 8;
           int g = 2345;
           int h = 3;
           int k = 5;
           int l1 = 5;
           int sum2 = f1 + (g / h) % (k * l1);

           System.out.println(sum2);

           /*
          ---Task-6---
           */

        int f2 = 8;
        int g1 = 2345;
        int h1 = 3;
        int k1 = 5;
        int l2 = 5;
        int sum3 = f2 += g1;
        sum3 = sum3 /= h1;
        sum3 = sum3 %= k1;
        sum3 = sum3 *= l2;

        System.out.println(sum3);

            /*
        ----Task-7
            */

        boolean z = 23 == 45;

        System.out.println("boolean is: " + z);

          /*
        ----Task-8
           */

          boolean x = -10 == 10;

        System.out.println("boolean is: " + x);

    }
}


