package scannerClass;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class ScannerString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first  name: ");
        String firstName = sc.nextLine();

        System.out.println("Please enter last  name: ");
        String lastName = sc.nextLine();

        System.out.println("Please enter your age: ");
        byte age = sc.nextByte();

        System.out.println("\nHello " + firstName + " " + lastName + "!" +"\n You are so young! Just " + age + " years old!");



        Scanner firstTask = new Scanner(System.in);
        System.out.println("Please enter first number: ");

        int x = firstTask.nextInt();

        System.out.println("Please enter second number: ");
        int y = firstTask.nextInt();
        int multiplication = x * y;

        System.out.println(x + " * " + y + " = ");
        //=========Task-2

        Scanner secondTask = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int f = secondTask.nextInt();

        System.out.println("Please enter second number: ");
        int g = secondTask.nextInt();

        System.out.println("Please enter third number: ");
        int h = secondTask.nextInt();
        int addition = f + g + h;

        System.out.println(f + " + " + g + " + " + h + " = " );

        //------Task-3

        Scanner grocery = new Scanner(System.in);
        System.out.println("Please enter the product name: ");
        String productName = grocery.nextLine();

        System.out.println("Please enter price: ");
        double d = grocery.nextByte();











    }
}
