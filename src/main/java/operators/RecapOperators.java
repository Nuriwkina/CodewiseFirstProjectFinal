package operators;

public class RecapOperators {
    public static void main(String[] args) {

        System.out.println("Hello Codewise!");

        String text = "Java programmer";
        int num = 20;
        double d = 10.23;
        char c = 'j';
        char k = '&';
        byte b = 12;

        System.out.println("String text:" + text);
        System.out.println("int: " + num);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("char: " + k);
        System.out.println("byte: " + b);

        int n = 20;
        double d2 = 30.5;
        d2 = n;

        System.out.println(d2);


        int width = 145;
        int length  = 145;
        int square = (width + length);

        System.out.println("The area of area is: " + width);
        System.out.println("The area of area is: " + length);
        System.out.println("is square: " + square);


        int length2 = 123;
        int  width2 = 123;
        int perimeter = (length + width) * 2;
        System.out.println("The width of the square is: " +  width2 );
        System.out.println("The length of the square is: " + length2 );
        System.out.println("The length of the square is: " +  perimeter );

        int length3= 98;
        int  width3 = 54;
        int  perimeter1 = (length + width) * 2;
        System.out.println("The width of the square is: " +  width3);
        System.out.println("The length of the square is: " + length3);
        System.out.println("The length of the perimeter is: " + perimeter1);

        int length4= 4134;
        int  width4 = 12344;
        int  area = (length + width) * 2;

        System.out.println("The width of the square is: " +  width4);
        System.out.println("The length of the square is: " + length4);
        System.out.println("The area of the rectangle  is: " +  area);


        int f = 12;
        int g = 5;
        int h = (12 + 5) + (12 + 5);
        System.out.println("f + g = " + (f + g));


        int result = 1 + 2;
        System.out.println(result);

        // result = result - 1;
        result -= 1;
        System.out.println(result);

        //result = result * 2;
        result *= 2;
        System.out.println(result);

        //result = result / 2;
        result /= 2;
        System.out.println(result);

        //result = result + 8;
        result += 8;
        System.out.println(result);

        //result = result % 7;
        result %= 7;
        System.out.println(result);


        // lets's practice comparison operators:

        boolean compare;

        compare = 3 == 5;

        /*
        = assign the value
        == compare, equals?
         */

        System.out.println("3 == 5: " + compare);

        System.out.println("3 > 5: " + (3 > 5));

        System.out.println("3 < 5: " + (3 < 5));

        System.out.println("3 >= 5: " + (3 >= 5));

        System.out.println("3 <= 5: " + (3 <= 5));

        System.out.println("5 <= 5: " + (5 <= 5));

        /*
        // == equals ?
        != not equal ?
        =! not equal ?
           */

        System.out.println("3 != 5: " + (3 != 5));

        int age = 30;
        int years = -30;
        boolean isTrue = age != years;

        age = 5;
        years =5;
        isTrue = age == years;


        int x = 10;
        int y = 5;
        int exp1 = ( y * ( x / y + x / y));
        int exp2 = ( y *  x / y + y * x / y);

        System.out.println(exp1);
        System.out.println(exp2);

        int exp3 = x/ y;
        exp3 = exp3 + (x / y);
        exp3 = exp3 * y;


        int xd = 9;
        int yd= 12;
        int ad = 2;
        int bd = 4;
        int cd = 6;
        int exp = (3 + 4 * xd) / 5 -10 * (yd- 5) * ( ad + bd + cd) / xd + 9 * ( 4 / xd + (9 + xd) / yd);

        /* int exp5 = 3 + 4 * xd;
        exp = exp / 5;
        int tempInt = yd - 5;
        tempInt = tempInt * 10;
        exp = exp - text;
        tempInt = ad + bd + cd;
        exp = exp * tempInt;
        exp = exp / xd;
        tempInt =  4 / xd + (9 + xd);
        exp = exp + tempInt;
          */









    }
}
