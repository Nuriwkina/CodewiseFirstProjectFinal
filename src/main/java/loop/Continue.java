package loop;

public class Continue {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {


            if (i >= 3 & i <= 6) {
                continue;
            }
            System.out.println(i);
        }



        for (int i = 1; i <= 10; i++) {
            System.out.println("The number before if: " + i);
            if (i >= 3 & i <= 6) {
                continue;
            }

            System.out.println("The number after if: " + i);
        }
    }
}