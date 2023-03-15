package practiceMath;

public class MathIntro {
    public static void main(String[] args) {
        System.out.println(calculateCircleArea(2));

        System.out.println(calculateSquareRoot(16));





    }

        public static double calculateCircleArea ( double radius){
           return Math.PI * Math.pow(radius, 2);



        }

        public static double calculateSquareRoot(double number){
        return Math.sqrt(number);
        }
    }

