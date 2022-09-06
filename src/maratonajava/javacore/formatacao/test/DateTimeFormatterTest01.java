package maratonajava.javacore.formatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("-----------------------------------");
        LocalDate parse1 = LocalDate.parse("20220830", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2022-08-30+05:00", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2022-08-30", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        System.out.println("-----------------------------------");
        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);
        LocalDateTime parse4 = LocalDateTime.parse("2022-08-30T15:47:02.8510141", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse4);

        System.out.println("-----------------------------------");
        //dd/MM/yyyy
        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyy");
        System.out.println("formatterBR: " + LocalDate.now().format(formatterBR));
        LocalDate parseBR = LocalDate.parse("30/08/2022", formatterBR);
        System.out.println(parseBR);
        //MM/dd/yyyy
        DateTimeFormatter formatterUS = DateTimeFormatter.ofPattern("MM/dd/yyy");
        System.out.println("formatterUS: " + LocalDate.now().format(formatterUS));
        //yyyy/MM/dd
        DateTimeFormatter formatterJPN = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println("formatterJPN: " + LocalDate.now().format(formatterJPN));
    }
}
