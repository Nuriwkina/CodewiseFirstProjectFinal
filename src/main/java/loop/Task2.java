package loop;

public class Task2 {
    public static void main(String[] args) {
        printEachLetter("Kennedy");
        String title = "Ok Class. We done!";
        printEachLetter(title);
    }
    //Pseudo Code
    //1. Method signature
    //2.

    public static void printEachLetter(String word) {
        if (word.isEmpty()) {
            System.out.println("Invalid data. String cannot be empty");
        } else {

            for (int i = 0; i < word.length(); i++) {
                //get each latter character from string
                char c = word.charAt(i);
                System.out.println(c);

            }
            }
        }
            public static void printAllNumbers ( int number){
                if (number > 0) {
                    for (int i = 0; i <= number; i++) {
                        System.out.println(i);
                    }
                } else {
                    System.out.println("Invalid number. Please try again");
                }

            }
        }



