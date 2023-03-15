package stringManipulation;

public class CharAt {
    public static void main(String[] args) {
        String str = "abcdefg";
        System.out.println(str.charAt(3));
        /*
        charAt(int index) takes an integer
        and returns char behind that integer
        can only be used by String

        indexOf(char c), method belongs to String class
        takes a char in single quotes, returns the index
        of this char
         */

        System.out.println(str.indexOf('c'));


        int index = str.indexOf('g');
        System.out.println(index);

        /*
        charAt() method that returns int
        it belong to String class, and can only  be used by String in will returns us yhe char of  index
         */

        //==========================================================================
        /*
        What if string has 2 or more same letters?
      */

        String str2 = "abcaccdeelaab";
        System.out.println(str2 + ": " + str2.indexOf('b'));
        int index2 = str2.indexOf('b', 5);
        System.out.println(index2);

        String  name = "Angelina";
        /*
        A = 0
        n = 1
        g = 2
        e = 3
         */

        char a = name.charAt(3); //returns e
        System.out.println(a);

        String text = "Hello everyone! Hope you are well. I wish you all good luck and at least 120k salary.";

        //=========length() returns number of characters in the string
        // returns int can be only use by String
        // is the only method that starts from 1

        System.out.println("the number of letters: " + text.length());

        String country = "USA";
        System.out.println(country + "has " + country.length() + "letters");

        country = "Mexico";
        System.out.println(country + "has " + country.length() + "letters");

        country = " Mexico ";
        System.out.println(country + "has " + country.length() + "letters");

        country = "Kyrgyzs  t a n";
        System.out.println(country + "has " + country.length() + "letters");

        System.out.println(country.charAt(0));

       //---------------

        String school = "Harvard";
        String anotherSchool = "Stanford";
        /*
        s = 0
        t = 1
        a = 3

         */

        System.out.println(school.charAt(0));
        System.out.println(anotherSchool + " 's last latter is: " + anotherSchool.charAt(anotherSchool.length() - 1));








    }





}
