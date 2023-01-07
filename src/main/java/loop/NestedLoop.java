package loop;

public class NestedLoop {
    public static void main(String[] args) {

        for (int h = 0; h < 10; h++) {
            System.out.println("hello!");
        }


        System.out.println();
        int y = 0;
        while (y <= 10) {
            System.out.println("hi!");
            y++;


        }
        System.out.println();
        int a = 1;

        do {
            System.out.println("buy buy");
            a++;
        } while (a >= 10);


        for (int i = 1; i <= 3; i++) {
            System.out.println("WEEK: " + i);

            for (int j = 1; j <= 7; j++) {
                System.out.println("day: " + j);
            }
        }
        System.out.println();
        for (int i = 1; i <= 12; i++) {
            System.out.println("MONTH: " + i);

            for (int j = 1; j <= 30; j++) {
                System.out.println("    day  " + j);
            }

        }

        for (int b = 1; b <= 7; b++) {

            for (int k = 1; k <= b; k++) {
                System.out.print("*");
            }
            System.out.println();

        }

        for(int jj=1;jj<=6;jj++){
            for(int sss=1;sss<=7-jj;sss++){
                System.out.print(" ");
            }
            for(int v=1;v<=jj*2-1;v++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println(" !!!HAPPY NEW YEAR!!!");

    }
}
