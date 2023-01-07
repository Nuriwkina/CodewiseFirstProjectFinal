package stringManipulation;

public class StringManipulationHomework {

    public static void main(String[] args) {

        String message = "Hello everyone, Let's do Java String exercises";
        int index = 10;
        //----1
        char a = message.charAt(10);
        System.out.println("The character of number 10 is: " + a);
        //----2
        System.out.println("The length of the String message is: " + message.length());
        //----3
        System.out.println("String message all in uppercase is: " + message.toUpperCase());
        //----4
        System.out.println("String message all in lowercase is: " + message.toLowerCase());
        //----5
        char b = message.charAt(5);
        System.out.println("Letter number is: " + b);
        //-----6
        System.out.println("Last latter is: " + message.charAt(message.length()-1));
        //-----7
        System.out.println("first letter in lowercase: " + message.toLowerCase().charAt(0));
         //-----8
        System.out.println("last letter in uppercase is: " + message.charAt(message.length()-1));






























    }
}
