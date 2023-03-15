package practiceMoc;

public class Moc {public static void main(String[] args) {
    String result = getSumOfDigits("Happy new 2023!");
    System.out.println(result);
}

    public static String getSumOfDigits(String s){
        int sum = 0;
        for(int i = 0; i < s.length();i++){
            char temp = s.charAt(i); // it will go through each character
//            System.out.println(temp);
            if(Character.isDigit(temp)){

                sum += Integer.parseInt(temp + "");
            }
        }
        String resultInString = sum + "";
        return resultInString;
    }
}
