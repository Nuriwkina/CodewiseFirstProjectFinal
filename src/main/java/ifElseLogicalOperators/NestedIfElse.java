package ifElseLogicalOperators;


import javax.imageio.stream.ImageInputStream;

public class NestedIfElse {

    public static void speeding(int speed, boolean isBirthday) {
        if (!isBirthday) {
            if (speed > 60 && speed <= 80) {
                System.out.println("You get small ticket");
            } else if (speed > 80) {
                System.out.println("you get big ticket");
            } else {
                System.out.println("No ticket");
            }


        }
    }

    public static void main(String[] args) {

        speeding(90, true);
        speeding(81, false);
        speeding(120, false);
        speeding(78, false);

    }


    public static boolean twoAsOne(int a, int b, int c) {
        if (a + b == c || a + c == b || c + b == a) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
            if (cigars >= 40) {
                System.out.println("The party was successful on weekend");
                return true;
            } else {
                System.out.println("The party failed on weekend");
                return false;
            }
        } else {
            if (cigars >= 40 && cigars <= 60) {
                System.out.println("Party was successful on weekday");
                return true;

            } else {
                System.out.println("Party was successful on weekday");
                return false;

            }
        }
    }
}