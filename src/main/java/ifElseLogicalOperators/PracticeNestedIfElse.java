package ifElseLogicalOperators;

public class PracticeNestedIfElse {
    public static void main(String[] args) {


        System.out.println(teenNumber(20, 13));
    }

    public static int teenNumber(int a, int b) {

        if (a >= 13) {
            if (a <= 19) {
                return 19;
            }
        }  if (b >= 13) {

            if (b <= 19) return 19;
        }
            return a + b;
        }

    }
