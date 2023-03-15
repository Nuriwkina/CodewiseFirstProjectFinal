package practiceMockFibonacciNum;

public class Factorial {

    public static int factorialNumber(int number){
        int a = 1;
        for (int i = 1; i <= number; i++) {
            a *= i;
        }
        return a;
    }
    public static int factorial2(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorialNumber(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(factorialNumber(4));

        System.out.println(factorialNumber(5));
    }
}
