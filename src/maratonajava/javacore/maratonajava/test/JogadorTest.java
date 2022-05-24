package maratonajava.javacore.maratonajava.test;

import maratonajava.javacore.maratonajava.dominio.Jogador;

public class JogadorTest {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Lionel Messi");
        Jogador jogador2 = new Jogador("Cristiano Ronaldo");
        Jogador jogador3 = new Jogador("Robert Lewandowski");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            System.out.println(jogador.toString());;
        }

    }
}
