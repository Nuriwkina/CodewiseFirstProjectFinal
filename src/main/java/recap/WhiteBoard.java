package recap;

public class WhiteBoard {
    public static void main(String[] args) {

     getSumOfDigits("Happy new 2023!");

    }


         public static String getSumOfDigits (String s){
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                char temp = s.charAt(i);
                if (Character.isDigit(temp)) {
                    sum += Integer.parseInt(temp + "");// --> we convert
                }
            }
            //convert to--> integer to String
            String resultInString = sum + "";
            return resultInString;

        }
    }
