package arrorsAndExceptions;

import java.util.InputMismatchException;

public class ExceptionsIntro {
    private int age;
    private String username;
    private long creditCardNumber;

    public long getCreditCardNumber() {
        return creditCardNumber;
    }
    /*
    check the length creditCardNumber. It must be 16 ====> throw. IndexOutOfBounds
    make sure all chars are digits, no letter, no spec characters are allowed ===> InputMismatchException check the first
    digits must start with 44, if not, throw InputMismatchException ("Only Visa cards allowed")
     */


    public static void main(String[] args) throws Exception {
        ExceptionsIntro exceptionsIntro = new ExceptionsIntro();
        //exceptionsIntro.setAge(19); //no output
        //exceptionsIntro.setAge(34); // incorrect age

        //exceptionsIntro.setUsername("Google@");
        //exceptionsIntro.setUsername("Google123456789=98765432");
        //exceptionsIntro.setUsername("Google");
        //exceptionsIntro.setUsername("Google_rt");

        exceptionsIntro.setCreditCardNumber(4434567889123415l);


        System.out.println("Checking the ages 19 and 34. Looks good");
    }
    /*
    Age must be between 21 and 65 inclusively
     */

    public void setAge(int age) throws Exception {

        if (age <= 65 && age >= 21) {
            this.age = age;
        } else {
            System.out.println("Incorrect age, must be between 21 and 65");
            throw new Exception("Incorrect age, must be between 21 and 65");
        }

    }

    /*
    assign username to username:
    check if username length is between 8 to 20 characters===> throw OutOfBoundsException, say length must be
    between make sure username does not contain @, _ =====> throw Exception, say @_ are not allowed
     */
    public void setUsername(String username) throws Exception {
        if (username.length() >= 8 && username.length() <= 20) {
            if (!username.contains("@") && !username.contains("_")) {
                this.username = username;

            } else {
                throw new Exception("'@' and '_' are not allowed");
            }

        } else {
                throw new IndexOutOfBoundsException("Length should be more less than 20");


        }
    }
        public void setCreditCardNumber(long creditCardNumber){
            String card = creditCardNumber + "";
            if (card.length() == 16) {

                if (card.substring(0, 2).equals("44")) {

                    for (int i = 0; i < card.length(); i++) {

                        if (Character.isDigit(card.charAt(i))) {
                            this.creditCardNumber = creditCardNumber;
                        } else {
                            throw new InputMismatchException("Only digits are allowed");
                        }
                    }

                } else {
                    throw new StringIndexOutOfBoundsException("Only visa cards are allowed");
                }
            } else {
                throw new StringIndexOutOfBoundsException("Length must be 16");
            }
        }
    }

