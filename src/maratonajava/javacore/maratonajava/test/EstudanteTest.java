package maratonajava.javacore.maratonajava.test;

import maratonajava.javacore.maratonajava.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();

        estudante1.setNome("Andrey");
        estudante1.setIdade(22);
        estudante1.setSexo('M');

        System.out.println(estudante1.toString());

    }
}
