package dateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class PracticeJavaTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);


        Date date2 = new Date();
        System.out.println(date2);


        System.out.println(date.getEra());
        System.out.println(date.getChronology());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfYear());

        System.out.println(date.atTime(LocalTime.now()));
        System.out.println(date.atStartOfDay());
        System.out.println(date.datesUntil(LocalDate.of(2016, 1, 23)));
        System.out.println(daysToNY());
        System.out.println(daysToNY(07, 24));


        LocalTime time = LocalTime.now();
        System.out.println(time);


    }
    public static int daysToNY(){
        LocalDate date = LocalDate.now();
        return (int)date.datesUntil(LocalDate.of(2023, 07, 24)).count();


}


    public static int daysToNY(int month, int day ){
        LocalDate date = LocalDate.of(2023, month,day);
        return (int)date.datesUntil(LocalDate.of(2024, 12, 31)).count();
    }

}
