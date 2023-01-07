package stringManipulation;

public class PracticeAndEquals {
    public static void main(String[] args) {

        String hello1 = "Hello World!";

        String hello2 = "Hello world!";

        String hello3 = new String("HelloWorld!");
     //------1
       boolean isSame = hello1.equals(hello2);
        System.out.println(isSame);
     //------2
        isSame = hello1.equals(hello3);
        System.out.println(isSame);
     //-------3
        isSame = hello1.equals(hello2);
        System.out.println("compare of hello1 and hello2 are same objects: " + isSame);
        System.out.println("Hello World! == Hello world!: " + (hello1==hello2));

     //-------4
        boolean isSame1 = hello1.equals(hello1);
        System.out.println("isSame: " + isSame);

        isSame = hello2.equalsIgnoreCase(hello1);
        System.out.println("isSame: " + isSame);

        isSame = hello2.equalsIgnoreCase(hello1.toUpperCase());
        System.out.println("isSame: " + isSame);

        isSame  = hello2.toLowerCase().equalsIgnoreCase(hello1.toUpperCase());

        isSame = hello2.toLowerCase().equalsIgnoreCase(hello1.toUpperCase());
        System.out.println();

     //-----5
        isSame = hello1.equals(hello2);
        System.out.println(hello1.toLowerCase().equals(hello2.toLowerCase()));






    }
}
















