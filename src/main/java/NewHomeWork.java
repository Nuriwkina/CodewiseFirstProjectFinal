import java.util.Scanner;

public class NewHomeWork {
    public static void main(String[] args) {

        Scanner floyd = new Scanner(System.in);

        int a = floyd.nextInt();
        printFloyd(a);
        floyd.close();
    }

        /*
--------------Task-1-----------------
write a program using nested for loop, that will print the following output. It's called Floyd's Triangle.

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

 */

public  static void printFloyd(int num) {
    int i = 1;


  for (int h = 1; num <= 5; h++) {
      for (int g = 1; g <= h; g++)

      System.out.println(i+ " ");
      i++;



  }
    System.out.println();



    }

    //===============Task-2------------------


}
