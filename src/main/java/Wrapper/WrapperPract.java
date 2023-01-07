package Wrapper;

import stringManipulation.CharAt;

public class WrapperPract {
    public static void main(String[] args) {

        int age = 35;
        char letter = 'S';

        //Wrapper class
        // convert age and letter to Object type. Wrapper class
        // Autoboxing: converting from primitive to object

        Integer i = age;
        System.out.println(i);
        System.out.println(age);

        Character  c = letter;
        //Unbox both i and c into primitive data types. Create new ones

       char s = c;
       int w = i;
       Boolean b = true; // boolean b = true;
        boolean v = b;

        //  Array.toString(arr); => print value in that array
        // Utility method


        System.out.println("Password validation\n");
        System.out.println(validatePassword("James!0"));
        System.out.println();
        getDigits("Hello 202wed3!");

    }

    public static boolean validatePassword(String password){
        boolean found = false;
        for (int i = 0; i< password.length(); i++){
            char letter = password.charAt(i);
            if(Character.isDigit(letter)){
                found = true;
                 break;

            }
        }
return found;
    }

    public static void getDigits(String word){

        String numbers = "";
        for(int i = 0; i < word.length(); i++){
            char letter = word.charAt(i);
            if(Character.isDigit(letter)) {
                numbers += letter; // ------> numbers = numbers + letter; "2" + "0" = "2023"
            }
            }
        int result=Integer.parseInt(numbers); // ========> this is converting

            System.out.println("Numbers: " + result);




        }
    }

