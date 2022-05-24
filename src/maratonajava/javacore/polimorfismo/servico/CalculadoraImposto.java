package maratonajava.javacore.polimorfismo.servico;

import maratonajava.javacore.polimorfismo.dominio.Produto;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: R$" + produto.getValor());
        System.out.println("Imposto a ser pago: R$" + imposto);
    }
}
