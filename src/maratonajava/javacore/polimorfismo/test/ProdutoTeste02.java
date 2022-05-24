package maratonajava.javacore.polimorfismo.test;

import maratonajava.javacore.polimorfismo.dominio.Computador;
import maratonajava.javacore.polimorfismo.dominio.Produto;
import maratonajava.javacore.polimorfismo.dominio.Tomate;

public class ProdutoTeste02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor() );
        System.out.println(produto.calcularImposto());
        System.out.println("------------------------------------------");
        Produto produto2 = new Tomate("Tomate Banana", 7);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor() );
        System.out.println(produto2.calcularImposto());
    }
}
