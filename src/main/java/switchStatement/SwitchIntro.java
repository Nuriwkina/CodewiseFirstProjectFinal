package switchStatement;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class SwitchIntro {
    public static void main(String[] args) {


        int number = 20;
        switch (number) {
            case 1:
                System.out.println("number is equal to ONE");
                break;
            case 2:
                System.out.println("hdhd");
                break;
            case 5:
                System.out.println("number is equal to FIVE");
                break;
            case 10:
                System.out.println("number is biig");
                break;
            default:
                System.out.println("couldnt find the number!");


        }
    /*
    we may have as many case statements as we want but only default statement
    default will execute in case if no match was found
     */

        int month = 1;
        String monthStr;

        switch (month) {
            case 1:
                monthStr = "Jan";
                break;
            case 2:
                monthStr = "Feb";
                break;
            case 3:
                monthStr = "Mar";
                break;
            case 4:
                monthStr = "Apr";
                break;
            case 5:
                monthStr = "May";
                break;
            case 6:
                monthStr = "Jun";
                break;
            case 7:
                monthStr = "Jul";
                break;
            case 8:
                monthStr = "Aug";
                break;
            case 9:
                monthStr = "Sep";
                break;
            case 10:
                monthStr = "Oct";
                break;
            case 11:
                monthStr = "Nov";
                break;
            case 12:
                monthStr = "Dec";
                break;
            default:
                monthStr = null;
                System.out.println("No month matched your r4equest, p;ease provide from 1 to 12");
        }
        System.out.println(monthStr);

        int ifMonth = 2;
        String ifMonthStr;
        if (ifMonth == 1) {
            ifMonthStr = "Jan";
        } else if (ifMonth == 2) {
            ifMonthStr = "Feb";
        } else if (ifMonth == 3) {
            ifMonthStr = "Mar";
        } else if (ifMonth == 4) {
            ifMonthStr = "Apr";
        } else if (ifMonth == 5) {
            ifMonthStr = "May";
        } else if (ifMonth == 6) {
            ifMonthStr = "Jun";
        } else if (ifMonth == 7) {
            ifMonthStr = "Jul";
        } else if (ifMonth == 8) {
            ifMonthStr = "Aug";
        } else if (ifMonth == 9) {
            ifMonthStr = "Sep";
        } else if (ifMonth == 10) {
            ifMonthStr = "Oct";
        } else if (ifMonth == 11) {
            ifMonthStr = "Nov";
        } else if (ifMonth == 12) {
            ifMonthStr = "Dec";
        } else {
            ifMonthStr = null;
            System.out.println("no match ");
        }


        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sut");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("coud'n find");

        }

        /*int day = 4;
        switch (day){
        if (day == 1) {
            switch ("Mon");
        }else if

         */
        ArrayList<String> colors = new ArrayList<>();
        int num = 3;
        switch (num){
            case 1: colors.add("red");
            case 2: colors.add("blue");
            case 3: colors.add("orange");
            case 4: colors.add("black");
            case 5: colors.add("white");
            case 6: colors.add("yellow");
            break;
            case 7: colors.add("green");
            case 8: colors.add("gray");
            case 9: colors.add("no color");
            default: colors.add("no color");
                System.out.println(colors);
        }
        }

    }

