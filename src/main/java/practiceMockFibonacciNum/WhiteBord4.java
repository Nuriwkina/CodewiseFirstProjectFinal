package practiceMockFibonacciNum;

public class WhiteBord4 {
    public static String getSumOfDigits(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (Character.isDigit(temp)) {
                sum += Integer.parseInt(temp + "");
            }
        }
        String resultInString = sum + "";
        return resultInString;
    }

        //Write a method that will accept an integer and return reversed value?:

        public static int reverse(int a){
            String str = a + "";
            String reverse1 = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                reverse1 += str.charAt(i);
            }
            return Integer.parseInt(reverse1);
        }

    }
