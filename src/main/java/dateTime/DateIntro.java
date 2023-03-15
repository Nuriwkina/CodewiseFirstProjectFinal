package dateTime;

import java.util.Date;

public class DateIntro {
    public static void main(String[] args) {
        /*
        Date class exists in java.util and java.sql packages
        below practice Date from java.util package.

        System time => Time of your computer
         */

        Date date =  new Date();
        System.out.println(date);

        Date myDoB = new Date (764069897L * 1000);




    }
}
