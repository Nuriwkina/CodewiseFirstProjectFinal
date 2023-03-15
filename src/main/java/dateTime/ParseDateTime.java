package dateTime;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.SimpleFormatter;

public class ParseDateTime {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Before formatting: " + dateTime);

        /*
        T--> delimiter is put between date and time
        yyyy-MM-dd hh:mm:ss S
        2023-01-27T10:47:20.702982

        dd-MM-yyyy HH:mm
         */

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formattedDate = formatter.format(dateTime);

        System.out.println("After formatting: " + formattedDate);


        //27-01-2023 10:52
        //27/01/2023 10:52

        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");
        formattedDate = formatter.format(dateTime);
        System.out.println("New format: " + formattedDate);

        //2023-01-27 10:52 am

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a");
        String formattedDate1 = formatter.format(dateTime);

        System.out.println("After formatting: " + formattedDate1);


    //Fri, 27 Jan 2023 10:52 am

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("E,dd MMM yyyy hh:mm a");
        String formattedDate2 = formatter.format(dateTime);

        System.out.println("After formatting: " + formattedDate2);

        /*
        String date = 27 Jan 2023
        String weekDay = Fri
        String time = 11:07 AM
         */



        /*
        Another way to format date using SimpleDateFormat class
         */



    }
}
