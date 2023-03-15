package methodOverloding;

public class OverloadedCalculator {

    /*
 ---Task-1-->   create:
 3 addition() methods: 2 int params, 3 int params, 2 double params
 3 substr-n() medh-s: 2 int params, 3 int params, 2 double params
 3 multiple-n() meth-s: 2 int params, 3 int params, 2 double params
 3 division() methods: 2 int params, 3 int params, 2 double params

return type is double for all 12 methods
     */

    public static double addition(int a, int b) {
        return a + b;

    }


    public static double addition(int a, int b, int c) {
        return a + b + c;
    }

    public static double addition(double a, double b) {
        return a + b;
    }

    public static double subtraction(int a, int b) {
        return a - b;
    }

    public static double subtraction(int a, int b, int c) {
        return a - b - c;
    }

   // public static double addition(double a, double b) {
     //   return a - b;


    public static double multiplication(int a, int b) {
        return a * b;
    }


    public static double multiplication(int a, int b, int c) {
        return a * b * c;
    }

  //  public static double addition(double a, double b) {
    //    return a * b;


    public static double division(int a, int b) {
        return a / b;
    }


    public static double division(int a, int b, int c) {
        return a / b / c;
    }

   // public static double addition(double a, double b) {
    //    return a / b;


    public static void main(String[] args) {


        System.out.println(addition(5, 10));
    }
}
