package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class ExercicioBreak {
    public static void main(String[] args) {
        // Dado um valor de um carro, descrubra em quantas vezes ele pode ser parcelado
        // Condição valorParcela >= 1000
        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira o valor do carro: R$");
        double valorCarro = entrada.nextDouble();

        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("O valor de R$" + valorCarro + " pode ser parcelado em " + parcela + "x de R$"
                    + valorParcela);
        }
    }
}
