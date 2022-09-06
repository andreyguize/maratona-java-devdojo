package maratonajava.javacore.formatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        // pt-BR
        Locale localeItaly = new Locale("it","IT");
        Locale localeCH = new Locale("it","CH");
        Locale localeBR = new Locale("pt","BR");
        Locale localeUS = new Locale("en","US");

        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeBR);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeUS);

        System.out.println("Italia: " + df1.format(calendar.getTime()));
        System.out.println("Suica: " + df2.format(calendar.getTime()));
        System.out.println("Brasil: " + df3.format(calendar.getTime()));
        System.out.println("Estados Unidos: " + df4.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry(localeUS));
        System.out.println(localeCH.getDisplayCountry(localeUS));
    }
}
