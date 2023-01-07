package operators;

public class ArithmeticOperators{
    public static void main(String [] arg) {

         // Assighment operator
        int x = 5;
        System.out.println("The value of x: " + x);

        x = 10;
        // x - operand
        // 10 - operand
        // = operator

        int y = 20;
        int p = 10;

        y = 5; //5
        y = p; //10

        y = y; //10;

        p = y; //10
        p = 5; //5
        p = p + 20; //25
        y = p; //25

        //-----------------

        String a = "abc";
        String b = "xyz";

        a = "Chicago";
        System.out.println(a);

        a = b;

        System.out.println(a);
        System.out.println(b);

        a = "Los Angeles";
        b = a;

        System.out.println(b + a);

        //--------------------Arithmetic operators-------------

        short num = 10;
        short num2 = 20;

        int sum = num + num2;

        System.out.println(sum);

        System.out.println(sum + 5);

        System.out.println(num + 100);

        // subtruction -

        /*int q + 1;
        int r + 2;

        int s + r - q; //1
        System.out.println(s = s + 5); //6

        s = s + 2 -1 ;
        System.out.println(s);

         */

        //------division---//

        byte nyByte = 9;
        byte nyByte2 = 3;
        System.out.println(nyByte / nyByte2);


        //-------modulus%

        int j = 10;
        int m = 3;

        System.out.println(j % 3);  //1
        System.out.println(j / m);  //10 / 3 = 3

        double d = 10;
        double c = 3;

        System.out.println(d / c);

        double d1= 10;
        double c1 = 3;

        System.out.println(d % c); //1
        System.out.println(25 % 3); //0
        System.out.println(25 % 5); //0
        System.out.println(5 % 3); //2
        System.out.println(10 % 9); //1
        System.out.println(10 % 6); //4 //10/6
        System.out.println(10 % 7); //3
        System.out.println(10 % 8); //2
        System.out.println(85 % 40); //5
        System.out.println(30 % 9); //3
        System.out.println(29 % 3); //2
        System.out.println(29 % 3); //2

        //======PRACTICE=========cmd + /

        int digit = 100;
        int anotherdigit = 20;

        System.out.println(digit % anotherdigit);
























    }

}



