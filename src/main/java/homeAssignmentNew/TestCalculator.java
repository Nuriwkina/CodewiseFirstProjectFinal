package homeAssignmentNew;

public class TestCalculator {
    public static void main(String[] args) {
         Calculator cal = new Calculator();

         int a = 5, b = 3;
         int sum = cal.add(a,b);
        System.out.println("Sum of: " + a + " and " + b + " is " + sum);

        int sum1 = cal.subtract(a,b);
        System.out.println("Difference of: " + a + " and " + b + " is " + sum);

        int product = cal.multiply(a,b);
        System.out.println("Product of: " + a + " and " + b + " is " + sum);

        int quotient = cal.divide(a,b);
        System.out.println("Quotient of: " + a + " and " + b + " is " + sum);

        boolean isEven = cal.isEven1(a);
        System.out.println("Is: " + a + " even: " + isEven);


    }
}
