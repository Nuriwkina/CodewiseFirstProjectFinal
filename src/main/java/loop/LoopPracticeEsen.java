package loop;

import java.util.Scanner;

public class LoopPracticeEsen {
    public static void main(String[] args) {

        String secretKey = "Chicago 2022!";
        Scanner scanner = new Scanner(System.in);
        int maxAttempts = 3;
        int attempt = 0;


        while (true) {

            System.out.println("Please enter your password: ");
            String enteredPassword = scanner.nextLine();


            if (enteredPassword.equals(secretKey)) {
                System.out.println("Successfully logged in!");

                break;
            } else {
                System.out.println("Wrong password! Try again!");

                attempt++;
            }
            if (attempt == maxAttempts) {
                System.out.println("Maximum attempts reached! Account suspended!");
                break;
            }

        }
    }}