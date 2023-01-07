package stringManipulation;

public class Replace {
    public static void main(String[] args) {

        /*
        replace(), takes 2 chars, and replace the first one with second one, and returns new String
         */


        String city = "Alabama";
        System.out.println(city.replace('a', 'e'));
        System.out.println(city.replace('L', 'e'));


     String numbersAndChars = "Hello 2023! ***Happy N3w Y3ar****";
        System.out.println(numbersAndChars.replace('*', '!'));
        System.out.println(numbersAndChars);

       //==============we can also replace  strings


       String cake = "honeycake";
        System.out.println(cake.replace("honey","chocolate"));
        System.out.println(cake);
        System.out.println(cake = cake.replace("chocolate", "honey"));





    }
}
