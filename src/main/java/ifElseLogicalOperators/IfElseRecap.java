package ifElseLogicalOperators;

public class IfElseRecap {

    public static void caughtSpeeding(int speed, boolean isBirthday) {
        if (speed <= 60) {
            System.out.println("no ticket");

        } else if (speed > 60 && speed <= 80 && !isBirthday) {

            System.out.println("you will get small ticket");
        } else if (speed > 60 && speed <= 80 && isBirthday) {
            System.out.println("since it's birthday , no ticket");
        } else if (speed > 80 && !isBirthday) {
            System.out.println("you get big ticket");
        } else if (speed > 80 && isBirthday) {
            System.out.println("you are lucky,no big ticket since its your birthday");

        }
    }

    public static void main(String[] args) {
            caughtSpeeding(59, true);
            caughtSpeeding(70, false);
            caughtSpeeding(90, true);
            caughtSpeeding(81, false);


        System.out.println(love6(1,4));  //false
        System.out.println(love6(3,3));  //true
        System.out.println(love6(6,5));  //true
        }

        public static boolean love6(int a, int b){

        if(a == 6 || b == 6 || a + b == 6){
            return true;
        }else{
            return false;
        }
            }
    }

