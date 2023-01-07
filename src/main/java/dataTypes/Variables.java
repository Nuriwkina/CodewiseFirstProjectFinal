package dataTypes;

public class Variables {

    public static void main (String [] args){


        System.out.println("My name is Nuri");

        // byte can store values from is -128 to 127

        byte a = 12;
        System.out.println(a);

        byte b = 127;
        System.out.println("first value of b: " + b);

        b = 23;
        System.out.println("second value of b: " + b);

        byte c = -128;

        //-----------Shorts--------//
        // -32768 to 32767

        short youngAge = 18;
        System.out.println("my age is " + youngAge);

        youngAge = -32768;

        youngAge = 125;

        System.out.println("New age is " + youngAge);

        //----------int--------------//
        // from -2,147,483,648 to 2,147,483,647

        int transactionID = 241345151;
        System.out.println("transaction ID: " + transactionID);

        transactionID = 111111111;

        int bankAccount = 111222;

        System.out.println("New transaction ID " + transactionID);

        System.out.println("My bank account number; " + bankAccount);

        bankAccount = 123456;

        //----short---------//

        short teenAge= 15;
        System.out.println("kids age is " + teenAge);

        teenAge= -32768;

        teenAge = 18;

        System.out.println("New age is " + teenAge);


        //--------long-------//


       //------char---------//


       char  Letter = 'a';
       char digit = 3;
       char specCharacter = '?';

       Letter = 'A';

        System.out.println(Letter + digit + specCharacter);

        System.out.println( "Char value; " + Letter + digit + specCharacter);


        char num = 'B';
        char newNum = 'C';

        System.out.println(123456);
        System.out.println(" My name");

        char w = '@';

        //-----


        String name = "Codewise 2022 Batch 1! @codewiseacademy";

        System.out.println(name);

        String firstName = "Nuri";
        String lastName = "Abdrakhmanova";
        System.out.println(firstName + " " + lastName);

        int age = 28;

        System.out.println("Hello my name is " + firstName + " " + lastName + " . I am " + age + " years old.");

        //----

        String city = "Chicago";

        System.out.println("Hello, my name is Nuri. " + " I am from " + " Chicago ");




    }
}
