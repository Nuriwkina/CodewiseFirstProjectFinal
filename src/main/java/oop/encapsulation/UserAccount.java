package oop.encapsulation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserAccount {
    public static void main(String[] args) {
    UserAccount ua = new UserAccount();
    ua.setUsername("@benokanai");
    ua.setUsername("abc123456");
    ua.setPassword("aB1aaaaaa@");

    }

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {

        String regex = "[!#$%^&*()+={}|:;,?><~]";
        Pattern pattern = Pattern.compile(regex);
        Matcher mather = pattern.matcher(username);

        if (username.length() <= 40 && !mather.find()) {
            System.out.println("Good username! " + username);
            this.username = username;
        }else{
            System.out.println("ERROR! Password must contain: 1 spec character");
            }
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length() >=8 && password.length() <= 20) {

            boolean hasDigit=false;
            boolean hasUpperCase=false;
            boolean hasLowerCase=false;
            boolean hasSpecCharacter=false;

            for (int i = 0; i < password.length(); i++)
                if (Character.isDigit(password.charAt(i))) {
                    hasDigit = true;
                } else if (Character.isUpperCase(password.charAt(i))) {
                    hasUpperCase = true;
                } else if (Character.isLowerCase(password.charAt(i))) {

                } else {
                    System.out.println();
                    hasSpecCharacter = true;
                }
        }
            System.out.println("ERROR! Password's length should be from 8 to 20 characters");
        this.password = password;
    }

    public boolean isPrivateAccount() {
        return isPrivateAccount;
    }

    public void setPrivateAccount(boolean privateAccount) {
        isPrivateAccount = privateAccount;
    }

    public String getZipcode(){
        return getZipcode();
    }
    public void setZipcode(String zipcode){
        if(zipcode.length() == 5){
           for (int i = 0; i < zipcode.length(); i++){
               if (!Character.isDigit(zipcode.charAt(i))){
                   System.out.println("ERROR, zip code must consist of digits only, no letter ");
                   break;
               }
           }
        }else{
            System.out.println("ERROR, zipcode must consist of 5 digits");
        }
    }

    private boolean isPrivateAccount;




    /*
    IDE --> integrated development environment
    Intellij, Eclipse
     */

    /*
    username
    username does not contain !, #, %, &, *, (, ), =, +
    username.length is no more than 40 character
    ======================================================
    password length is at least 8 characters
    password contains one upper case letter,
    one lower case  letter, one digit, one special char
    =====================================================
    ONLY ALLOWED following special characters:
    +underscore
    -dash
    @ at
     */
}
