package maratonajava.javacore.String.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Helton";
        String nome2 = "Helton";
        nome = nome.concat(" Bezerra");
        System.out.println(nome == nome2);
        String nome3 = new String("Helton");
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
