package maratonajava.javacore.polimorfismo.test;

import maratonajava.javacore.polimorfismo.dominio.Computador;
import maratonajava.javacore.polimorfismo.dominio.Televisao;
import maratonajava.javacore.polimorfismo.dominio.Tomate;
import maratonajava.javacore.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Cereja",10);
        Televisao televisao = new Televisao("Samsung Q80R 55\"",4000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("----------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("----------------------------------");
        CalculadoraImposto.calcularImposto(televisao);
    }
}
