package recap;

public class CountCharacterInString {

    public static void main(String[] args) {

        countCharacterInString("mama", 'a');
    }



    public static int countCharacterInString(String str, char letter){
        int count = 0;
        for( int i = 0; i < str.length(); i++){
            if(str.charAt(i) == letter){
               count ++;
            }
        }
        System.out.println(count);
        return count;
    }
}
