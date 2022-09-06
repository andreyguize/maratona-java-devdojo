package maratonajava.javacore.datas.test;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());

        System.out.println(Month.JANUARY.getValue());
        System.out.println(Month.FEBRUARY.getValue());
        System.out.println(Month.JUNE.getValue());
        System.out.println(Month.JULY.getValue());
        System.out.println(Month.DECEMBER.getValue());

        System.out.println("--------------------------");
        LocalDate date = LocalDate.of(2022, Month.FEBRUARY, 28);
        System.out.println(date.getYear());
        System.out.println("(" + date.getMonthValue()+") " + date.getMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear());
        System.out.println(date.get(ChronoField.YEAR));
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));
        System.out.println("--------------------------");
        System.out.println(date);

        System.out.println("--------------------------");
        LocalDate agora = LocalDate.now();
        System.out.println(agora);

        System.out.println("--------------------------");
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);
    }
}
