package Wrapper;

public class RecapAutoboxing {
    public static void main(String[] args) {
        /*
        autoboxing - converts primitives to objects
         */

        int a = 5;
        Integer aa = a; //this is autoboxing

        Integer bb = 10;//this is also autoboxing

        Integer cc = 10;
        System.out.println(cc); //10
        cc = 15;
        System.out.println(bb); //10
        cc = 10;
        System.out.println(bb == cc); // true





    }
}
