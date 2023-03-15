package enums;

public class EnumPractice {

    enum Months{
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER;
    }






    public static void main(String[] args) {

        WeekDays day = WeekDays.MONDAY;
        System.out.println(day);
        System.out.println(WeekDays.FRIDAY);

        Months [] m = Months.values();

        for (Months months : m) {
            System.out.println(months);

        };
    }

    public static void checkDay(){

    }
}

