package recap;

import java.util.Arrays;
import java.util.Scanner;

public class RecapIfElse2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many days were in the market?");
        int jobHuntingTime = sc.nextInt();

        System.out.println("How many offers do you have?");
        int offersNumber = sc.nextInt();

        double[] salaries = new double[offersNumber];
        for (int i = 0; i < salaries.length; i++) {
            System.out.println("Please enter salary of offer # " + i);
            salaries[i] = sc.nextDouble();
        }


        System.out.println(Arrays.toString(salaries));

    if(jobHuntingTime >= 30 && offersNumber == 1){

        System.out.println("I was in the market for more than a month,and i have 1 offer of " + salaries[0]);
        System.out.println("Accepting that offer");
    }else{
    if(offersNumber == 100000){
        System.out.println("Accepting the offer since it's " + salaries[0]);
        System.out.println("And I was in the market for less than a month, and got one offer");

    }else if (offersNumber> 1){
        Arrays.sort(salaries);
    }

  //  }else{

    }
    }
}



