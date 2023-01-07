package classesAndObjects;

import java.lang.reflect.Method;

public class User {


    String username;
    String password;
    String email;
    String dataOfBirth;
    String gender;
    String phoneNumber;
    boolean isPrivate;
    int getNumOfFollowers;
    String lastMessage;

    /*
    Method - is a function used to expose behavior of an object

    public is access modifier
    username, password = method parameters
     */

    public static void login(String username, int password) {
        System.out.println(username + "logged in using password: " + password);
    }


    public int getNumberOfFollowers(int username) {
        return getNumOfFollowers;
    }

    public String getLastMessage(String username) {
        return lastMessage;

    }

    public boolean isPrivateAccount(String username) {
        return isPrivate;

    }

    public String todayDate() {
        return "30 November 2022";
    }


    public void like(String username, String post) {
        System.out.println(username + " liked " + post);
        System.out.println(username + " liked " + post);
    }

    public  String string(){
        String name = "Nuri";
        return name;

    }

    public byte byteMethod() {
        byte b = 2;
        return b;
    }

    public short shortMethod() {
        short s = 5;
        return s;

    }

    public int intMethod() {
        int i = 28;
        return i;

    }
    public boolean booleanMethod() {
        boolean b1 = true;
        return b1;
    }
    public double doubleMethod(){
        double d = 23.346d;
        return d;
    }

}



