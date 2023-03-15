package methodOverloding;

public class MethodOverloading1 {
    public static void main(String[] args) {
        method1();
        method1("");
        method1(4);
        method1(3.5);
        method1(5,true);
        method1(5,'c');
    }

    private static void method1() {
    }

    private static void method1(int y, char c) {
    }


    public static void method1(int a) {
        System.out.println("inside method with one int");


    }

    public static void method1(String b) {
        System.out.println("inside method with one String");
    }

    public static void method1(double c) {
        System.out.println("inside method with one double");
    }

    public static void method1(int y, boolean character) {
        System.out.println("inside method with one int and one boolean");
}
//==========================================================================
    public static  int sum(int a, int b){
        return a + b;
    }
    /*
    ----Task-1---> create method, which takes 2 doubles and return their sum as int
     */

    public static int sum(double a, double b) {
        return (int) (a + b); //---> custing the data tipe
    }
        /*
    ----Task-2---> create method, which takes 2 floats and return their sum as int
         */
    public static int sum(float a, float b){
        return (int) (a + b); //--> we custed
    }
    /*
    ---Task-3--> create method, which takes 3 ints and return their sum as int:
     */
    public static int sum(int c, int d, int e){
        return c + d + e;
    }
    /*
    --Task-4--> create a method which takes one array of Strings, two ints, one boolean
    and returns string
     */

    public static String StringMethod(String [] arr, int a, int b, boolean c){
        return "";

    }
    /*
    --Task-5---> create String stringMethod, which accepts one int, one double, two Strings, one array of ints
    return "";
     */

    public static String StringMethod(int a, double b, String name, String LastName, int [] arr){
        return name;
    }
    /*
    --Task-6---> create String stringMethod, which accepts 10 String, and returns the first string
     */

    public static String StringMethod(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j){
        return a;
    }
}