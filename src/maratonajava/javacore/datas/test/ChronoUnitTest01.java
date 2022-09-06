package maratonajava.javacore.datas.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(1999, Month.NOVEMBER, 1, 12, 0, 0);
        System.out.println(ChronoUnit.DAYS.between(aniversario, LocalDateTime.now()) + " dias");
        System.out.println(ChronoUnit.WEEKS.between(aniversario, LocalDateTime.now()) + " semanas");
        System.out.println(ChronoUnit.MONTHS.between(aniversario, LocalDateTime.now()) + " meses");
        System.out.println(ChronoUnit.YEARS.between(aniversario, LocalDateTime.now()) + " anos");
    }
}
