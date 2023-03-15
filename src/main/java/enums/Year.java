package enums;

import java.util.Scanner;

public class Year {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter the enumeration to determine the corresponding season month : ");
        String str = scanner.next();
        System.out.println(str.equalsIgnoreCase(Seasons.WINTER.name()) ||
        str.equalsIgnoreCase(Seasons.SPRING.name())||
        str.equalsIgnoreCase(Seasons.SUMMER.name()) ||
        str.equalsIgnoreCase(Seasons.FALL.name())? "Valid season, Here are the months of this seasons : " :"Invalid season");

      switch(str.toUpperCase()){
          case "WINTER" :
                System.out.println("December, January, February");
                break;
          case "SUMMER" :
              System.out.println("June, July, August");
              break;
          case "FALL" :
              System.out.println("October, November");
              break;
          case "SPRING" :
              System.out.println("March, April, May");
              break;

          default :
              System.out.println("Please enter: Winter, Summer, Fall");
        }
    }
}


