package enums;

import java.util.Scanner;

public class Week {
    public static void main(String[] args) {
        /*
        using Scanner class, ask user to input day of the week
        check if the day is valid using WeeekDays enums
        if valid , print day
        invalid day
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter the day of the week: ");
        scanner.nextLine();
        String str = scanner.nextLine();
        str=str.equalsIgnoreCase(WeekDays.MONDAY.name()) || str.equalsIgnoreCase(WeekDays.TUESDAY.name())||
                str.equalsIgnoreCase(WeekDays.WEDNESDAY.name()) || str.equalsIgnoreCase(WeekDays.THURSDAY.name()) ||
                str.equalsIgnoreCase(WeekDays.FRIDAY.name()) || str.equalsIgnoreCase(WeekDays.SATURDAY.name() )||
                str.equalsIgnoreCase(WeekDays.SUNDAY.name()) ? "Valid" : "Invalid";
        System.out.println(str);










        }


    }

