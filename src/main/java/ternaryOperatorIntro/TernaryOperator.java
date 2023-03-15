package ternaryOperatorIntro;

public class TernaryOperator {
    public static void main(String[] args) {
      isPositiveOrNegative(5);


        int a = 20;
        int b = 30;
        int c = 0;

        c = a < b ? a : b; //20
        c = a == b ? 1 : 2; //2

        if (a < b) {
            c = a;
        } else {
            c = b;
        }


        int x = 100;
        int y = -100;
        int z;

        if (x > y) {
            z = y;
        } else {
            z = x;
        }
        z = x > y ? y : x;


        if (200 + 300 > 1000 - 600) {
            z = 100;
        } else {
            z = 0;
        }
        z = 200 + 300 > 1000 - 600 ? 100 : 0;


        String str1 = "hello";
        String str2;


        if (str1.length() > 1) {
            str2 = str1;
        } else {
            str2 = null;
        }
        str2 = str1.length() > 1 ? str1 : null;


        int num = 8;
        String msg = "";
        if (num > 10) {
            msg = " Number is greater than 10";
        } else {
            msg = num > 10 ? " Number is greater than 10" : " Number is less yhan or equal to 10";
            System.out.println(msg);
        }
    }

    public static String printIfEvenOdd(int a) {

        return a % 2 == 0 ? "even" : "odd";
    }
    // str length > 10, return true, return false

    public static boolean isLongWordBoolean(String str) {

        return str.length() > 10 ? true : false;
    }

    // if isLongWordBoolean()
    public static String isLongWord(String str) {
        return isLongWordBoolean(str) ? "long" : "Short";
    }

    public static String vowelOrConsonant(char c) {
        return c == 'e' || c == 'a' || c == 'i' || c == 'o' || c == 'u' ? "vowel" : "consonant";
    }

    public static String isPassingOrFailing(int i) {
        return i >= 50 ? "passing" : "failing";

    }

    public static String isPositiveOrNegative(int x) {
        String state = "Zero";
        if (x != 0)
            state = x > 0 ? "positive" : "negative";

        System.out.println(state);

        return state;
    }

}