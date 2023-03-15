package switchStatement;

public class SwitchBreak {
    public static void main(String[] args) {

        char letter = 'f';

        switch (letter) {

            case 'a':
                System.out.println("vowel");
                break;
            case 'e':
                System.out.println("vowel");
                break;
            case 'i':
                System.out.println("vowel");
                break;
            case 'o':
                System.out.println("vowel");
                break;
            case 'u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("consonant");
                break;

        }
        String city = "Chicago";
        switch (city) {
            case "Washington":
                for (int i = 0; i < "Washington".length(); i++) {
                    System.out.println("Washington".charAt(i));

                }
                if ("hello".equals("hi")) {
                    System.out.println("do this");
                }
                break;
            case "Seattle":
                for (int i = "Seattle".length() - 1; i > 0; i--) {
                    System.out.println("Seattle".charAt(i));
                }
                int k = 9;

                switch (k) {
                    case 1:
                        int o = 7;
                        switch (0) {

                        }

                }
        }
    }
}