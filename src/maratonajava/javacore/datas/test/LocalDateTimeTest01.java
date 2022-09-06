package maratonajava.javacore.datas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

//        LocalDate localDate = LocalDate.of(2023, Month.AUGUST, 6);
//        LocalTime localTime = LocalTime.of(9,45,21);

        LocalDate localDate = LocalDate.parse("2023-08-06");
        LocalTime localTime = LocalTime.parse("09:45:00");

        System.out.println(localDateTime);
        System.out.println(localDate);
        System.out.println(localTime);

        LocalDateTime ldt1 = localDate.atTime(localTime);
        System.out.println(ldt1);
    }
}
