package maratonajava.javacore.String.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Andrey");
        System.out.println(sb);
        sb.append(" Guize");
        System.out.println(sb);
        sb.append(" A").append(" B");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);
    }
}
