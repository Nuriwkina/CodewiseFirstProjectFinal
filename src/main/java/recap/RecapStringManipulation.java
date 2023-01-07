package recap;

public class RecapStringManipulation {
    public static void main(String[] args) {
        String str = "Hello World!";

        /*
        indexOf() this method is used only by String, and it takes one char
        and returns us the index of the given char.
       */

        int a = str.indexOf('e');
        System.out.println(a);

        int b = str.indexOf('r');
        System.out.println(b);

        System.out.println(str.indexOf('d'));
        System.out.println(str.indexOf('u'));
        System.out.println(str.indexOf("World"));
        System.out.println(str.indexOf("ld"));

        String country = "Kazakhstan";
        System.out.println(country.indexOf('a'));
        System.out.println(country.indexOf('a', 5));

        String text = "Hello, hello everyone, hello again";
        System.out.println(text.indexOf("hello"));
        System.out.println(text.indexOf("hello", 10));

        String name = "Nuriia";
        System.out.println(name.indexOf('N'));
        System.out.println(name.indexOf('a', 5));
//===================================================================

        /*
        charAt(), is a method which can be only used by String it takes ona int - index, and it will return the letter on that index
        Index - is position of your symbol

        indexOf - returns you index of char
        charAt = returns you char of that index
         */

        String city = "Los Angeles";
        System.out.println(city.charAt(1)); //0

        char letter = city.charAt(5);
        System.out.println(letter);

        char letter2 = city.charAt(3);
        System.out.println(letter2);

        System.out.println(city.charAt(10)); //s
        System.out.println(city.charAt(9)); // out of bounds

        /*
     when you give non existing letter to indexOf, it will just give you -1 it will not error out, it will throw error
     and stop your java

     if you give non existing index to charAt, it will throw error
     and stop your java
         */

        ///======================isEmpty()

        /*
        isEmpty(), method that can be used only by String , and it will check if your string is empty or not
         */

        String str1 = "hello";
        String str2 = "";

        System.out.println(str1.isEmpty());//false
        boolean bb = str2.isEmpty(); // true
        System.out.println(bb);

        System.out.println("hello everyone".isEmpty()); //false
        System.out.println(" ".isEmpty());

        /*
        replace(), method can only by used by String it will replace your old string/char with new one
         */

        String abc = "cucumber";
        String newAbc = abc.replace('c','d'); // dudumber
        System.out.println(newAbc);

        String anotherAbc = abc.replace("cu", "bo"); // bobomber
        System.out.println(anotherAbc);

        String banner = "Hello! Nice to meet you!"; // e => 0

        System.out.println(banner.replace('e', 'o'));
        //0-> u
        System.out.println(banner.replace("o","u"));
    }
}
