package Wrapper;

public class Casting {
    public static void main(String[] args) {

        /*
        implicit custing is done by java compiler and it converts one
         */

        byte a = 20;
        int b = a;
        short c = a;
        long d = a;
        float e = a;
        double f = a;
        /*
        explicit casting is used to convert ona data type
         to another manually by putting parenthesis in front
        of the given data type
         */
        int intNum = 30;
        byte byteNum = (byte)intNum; //-128 to 127
        System.out.println(byteNum);

        short shortNum = (byte)intNum;
        short shortNum2 = (short)intNum;
        short shortNum3 = byteNum;
       /*
       explicit casting: put l, in end of long , f, F in the end of float
        */
        long longNum = 1234l;
        intNum = (int)longNum;
        byteNum = (byte)longNum; //explicit
        double doubleNum = longNum; // explicit
        doubleNum = intNum; // implicit
        doubleNum = 1433.535f; //implicit casting
        float floatNum = (float)doubleNum;

        shortNum = (short) 32769;
        System.out.println(shortNum);

        floatNum = (float)134134.4343;
        floatNum = 134134.4343f;
        floatNum = 23.2f;






    }
}
