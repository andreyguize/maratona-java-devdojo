package maratonajava.javacore.datas.test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        if (calendar.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingo e o primeiro dia da semana");
        }

        System.out.println("--------------------------");
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("--------------------------");

        calendar.add(Calendar.DAY_OF_MONTH, 0);
        calendar.roll(Calendar.HOUR, 10);

        Date date = calendar.getTime();
        System.out.println(date);
    }
}
