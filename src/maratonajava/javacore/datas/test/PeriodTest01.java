package maratonajava.javacore.datas.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(7).plusWeeks(16);

        System.out.println(Period.between(now, nowAfterTwoYears));
        System.out.println(Period.ofDays(10));
        System.out.println(Period.ofWeeks(58));
        System.out.println(Period.ofMonths(3));
        System.out.println(Period.ofYears(3));
        System.out.println("--------------------------------");
        System.out.println(now.until(now.plusDays(Period.ofWeeks(58).getDays()), ChronoUnit.MONTHS));
    }
}
