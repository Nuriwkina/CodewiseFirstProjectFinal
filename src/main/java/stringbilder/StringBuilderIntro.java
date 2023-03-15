package stringbilder;

import java.util.Arrays;

public class StringBuilderIntro {
    public static void main(String[] args) {


        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(50);
        StringBuilder sb3 = new StringBuilder("hello");


        //=========================================

        StringBuilder fullName = new StringBuilder();
        String firstName = "John";
        String lastName = "Doe";
        String middleName = "Shawn";

        fullName.append(firstName + " " + lastName);
        System.out.println(fullName);

        fullName.append(middleName);
        System.out.println(fullName);
        /*
        insert()
         */

        StringBuilder address = new StringBuilder("123 Abc street");
        address.insert(4, "North");
        System.out.println(address);

        address.insert(address.length(),12345);
        System.out.println(address);

        address.insert(address.length() -5, " ");
        System.out.println(address);

        //123 North Abc street 12345
        //123 North Abc street 12345 Illinois
        //123 North Abc street 12345, Illinois
        //123 North Abc street 12345, Illinois
        //123 North Abc street 12345, Illinois

        String state = "Illinois";
        address.insert(address.length(), state);
        address.insert(address.length() - state.length(), ", ");
        System.out.println(address);

        String country = "USA";

        address.append(country);
        System.out.println(address);

        address.insert(address.length(), ", ");
        System.out.println(address);

        address.replace(0, 3, "456");
        System.out.println(address);

        address.replace(10, 13, "Xyz");
        System.out.println(address);

        String str = "hello codewise";
        str.replace("hello", "bye-bye");
        System.out.println(str);

       //====================================
        /*
        delete North
         */

        address.delete(4, 10);
        System.out.println(address);

        address.insert(address.length(), "South");
        System.out.println(address);


        address.reverse();
        System.out.println(address);

        String str2 = "Benazir";
        StringBuilder strRev = new StringBuilder();
        System.out.println(address.length());
        address.reverse();
        System.out.println(address);



        address = new StringBuilder(address.substring(0, 20));
        System.out.println(address);

        address = new StringBuilder(address.substring(4));
        System.out.println(address);
  /*
  substring (int beginIndex)
  str = hello abc
  str.substring(3)  =====> lo abc

  substring (int beginIndex, int endIndex
  str = chicago is windy city
  str.substring(0,5) ====> chica

   */

        /*
        substring method can be used by StringBuilder, but it will return String
         */


        int index=address.indexOf("X");
        System.out.println(index);

        String string1="hooerello";
        StringBuilder stringBuilder1=new StringBuilder("   hello everyone,happy    wednesday");

        System.out.println(string1.indexOf("lo"));
        System.out.println(string1.indexOf("o",3));

        System.out.println(stringBuilder1.indexOf("e",10));
        System.out.println(stringBuilder1.lastIndexOf("happy"));
        System.out.println(stringBuilder1.length());
        stringBuilder1.trimToSize();
        System.out.println(stringBuilder1.length());

        StringBuilder name= new StringBuilder("London is      ");
        System.out.println(name.length());
        System.out.println(name.length());

        StringBuilder strWord=new StringBuilder("Hello World! ");
        System.out.println(strWord);
        strWord.replace(0,5,"World!");
        System.out.println(strWord);
        strWord.replace(8,20,"Hello");
        System.out.println(strWord);




        StringBuilder problem1 = new StringBuilder("Hello World!");
        problem1 = new StringBuilder(
                problem1.toString().split( " ")[1] + " " + problem1.toString().split( " ")[0]);
        System.out.println(problem1);

        String products = "apple, banana, strawberry, chicken, avocado";
        String [] array = products.split(", ");
        System.out.println(Arrays.toString(array));
        String [] array2 = products.split("a");
        System.out.println();

        String toDo = "clean house=wash dishes=cook dinner=take out trash";
        String [] array3 = toDo.split("=");
        System.out.println(Arrays.toString(array3));

        StringBuilder prob2 = new StringBuilder("USA Mexico Canada");
        //Canada USA Mexico
        prob2 = new StringBuilder(prob2.toString().split(" ")[2] + " " + prob2.toString().split(" ")[0]
                + " " + prob2.toString().split(" ")[1]);
        System.out.println(prob2);






    }
}



