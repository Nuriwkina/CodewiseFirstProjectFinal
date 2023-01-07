package stringManipulation;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class IndexOf {
    public static void main(String[] args) {

        String str = "abcdefg";
        System.out.println(str.charAt(3));

        // charAt(itn index) takes an integer
        // and returns char behind that integer
        // can only be used by String

        /*
        indexOf(char c), method belong class takes a char in single quotes, returns index of this char
         */

        System.out.println(str.indexOf('c'));

        int letter = str.indexOf('g');
        System.out.println();

       //======what if string has 2 or more latters

        String str2 = "abcaccdeelaab";
        System.out.println(str2 + ": " + str2.indexOf(' '));

        int index2 = str2.indexOf('b',5);
        System.out.println(index2);

        str2.indexOf('c'); //if indexOf takes on char, in returns the index of that char
        int i = str2.indexOf("dee"); //in indexOf takes first char of that String
        System.out.println("index of dee: " + i);




        //==========


       String state = "u - Con ne124 c7%#@! ticut12412" ;

        System.out.println(state.indexOf('o')); //1
        System.out.println(state.indexOf("ti")); //6
        System.out.println(state.indexOf('u',state.length()/2));
        System.out.println(state.indexOf(state.charAt(state.length()-1)));


   /*
   isEmpty(), checks whether the string is empty or not and return true if not empty

    */

   String name1 = "Hello Codewise";
   String name2 = " ";
   String name3 = "%";
   String name4 = " ";

        System.out.println(name1.isEmpty()); //false
        System.out.println(name2.isEmpty()); //true
        System.out.println(name3.isEmpty()); //false
        System.out.println(name4.isEmpty()); //true
    }

}
