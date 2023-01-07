package loop;

public class Break {
    public static void main(String[] args) {
        /*
        break is a java keyword which is used to jump out of loop, to break loo
        it can be used with
        for loop, while and do while
        -----------
        print all number from 1 to 10
        if number = 8, we want to stop printing
         */

        for (int i = 1; i <= 10; i++) {
            if (i == 8) {
                System.out.println("reached number 8,  breaking the loop");
                break;
            }
            System.out.println(i);
        }
        System.out.println("code after for loop");

    }
/*
    int n = 20;
    while (n < 30){
        System.out.println(n);
        if(n == 25){
            System.out.println("Reached 25, breaking while loop");

        }
        n++;
    }

    int j = 5000;
           do{
        System.out.println(j);

        if (j == 5020) {
            break;
        }

      j++;
    }while{ (j < 10000);

 */

    }
