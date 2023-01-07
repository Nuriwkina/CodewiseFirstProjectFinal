package stringManipulation;

import classesAndObjects.Animal;
import classesAndObjects.Zoo;

public class StringManipulation {
    public static void main(String[] args) {

      String name = "John";
      String name2 = "John";

      boolean isEqual = name == name2;
        System.out.println(isEqual);


        String city = "Chicago";
        String city2 = "Miami";
        isEqual = city == city2;
        System.out.println("Chicago == Miami: "+ isEqual);

        String newCity = new String("Chicago");
        isEqual = city == newCity;
        System.out.println("Chicago == new Chicago: " + isEqual);


        ///===================

        String cake1 = "honeycake";
        String cake2 = "cheesecake";
        String cake3 = "Honeycake";
        String cake4 = "cheesecake";
        String cake5 = new String("cheesecake");
        boolean isSamecake = cake1 == cake2;
        System.out.println("honeycake is same as cheese" + isSamecake);

        isSamecake = cake1 == cake3;
        System.out.println("honeycake is same as HoneyCake" + isSamecake);

        isSamecake = cake2 == cake4;
        System.out.println("cheesecake is same as cheesecake: " + isSamecake);

        isSamecake = cake4 == cake5;
        System.out.println("cheesecake is same as cheesecake: " + isSamecake);

        // ============equals() method from String class
        // it only compares value
        // it can be used by String only
        // it is a method returns boolean: true  or false


       //===============toLowerCase(), tUpperCase()
        // These are String methods, that convaert text to all lower case , or















    }
}
