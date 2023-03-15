import java.util.Scanner;

public class NewHomeWork {
    public static void main(String[] args) {
        // --------------Task------------------
        // write a program using nested for loop, that will print the following output. It's called Floyd's Triangle.
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15
        //

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int counter = 1;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
}









