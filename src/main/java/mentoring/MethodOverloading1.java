package mentoring;

public class MethodOverloading1 {
    public static void main(String[] args) {

        method1();
        method1(8);
        method1(3.5);
        method1("Hello");
        method1(true);
        method1("!");



    }
    public static void method1() {
        System.out.println("inside method with no params");

    }
    public static void method1(int a){
        System.out.println("inside method with one int ");
    }
    public static void method1(String name){
        System.out.println("inside method with one String ");
    }
    public static void method1(boolean IsTrue){
        System.out.println("inside method with one boolean ");

    }
    public static void method1(short age){
        System.out.println("inside method with one short");

    }
    public static void method1(double height){
        System.out.println("inside method with one double");
    }
    public static void method1(char c){
        System.out.println("inside method with one char ");
    }






}


