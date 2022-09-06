package maratonajava.javacore.resourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        ResourceBundle bundlePtBr = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(bundlePtBr.getString("hello"));
        System.out.println(bundlePtBr.getString("good.morning"));

        System.out.println("--------------------------");
        ResourceBundle bundleEnUs = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(bundleEnUs.getString("hello"));
        System.out.println(bundleEnUs.getString("good.morning"));

        System.out.println("--------------------------");
        System.out.println(bundlePtBr.getString("hi"));
        System.out.println(bundleEnUs.getString("hi"));
    }
}
