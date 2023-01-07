package loop;

public class WhileLoop {
    public static void main(String[] args) {

        int x = 1;
        while (x <= 10) {
            System.out.println("Good morning!");
            x++;

        }
        int w = 0;
        while (w <= 20) {
            System.out.println(w);
            w++;


        }
        int y = 1;
        while (y <= 31) {
            System.out.println(y + " January 2023");
            y++;
        }
        int q = 1;
        while (q <= 30) {
            if (q % 2 == 0) {
                System.out.println(q + "even + 3 = " + (q + 3));
            } else {
                System.out.println(q + " - odd  + 2 = " + (q + 2));
            }
            q++;
        }

            for (int i = 100; i > 0; i--) {
                if (i % 4 == 0){
                    System.out.println(i + "quarter");
                }
               if (i % 2 == 0){
                   System.out.println(i + "double");
               }
               else{
                   System.out.println(i);
               }
    }

        }
    }
