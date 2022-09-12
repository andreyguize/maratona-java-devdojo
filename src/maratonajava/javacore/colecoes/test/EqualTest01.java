package maratonajava.javacore.colecoes.test;

import maratonajava.javacore.colecoes.dominio.Smartphone;

public class EqualTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "Apple");
        Smartphone s2 = new Smartphone("1ABC1", "Apple");
        System.out.println(s1.equals(s2));
    }
}
