package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class ExercicioTaxaSobreSalarioAnual {
    public static void main(String[] args) {
        //Se ganhar entre 1 e 34.712, taxa de 9.70%
        //Se ganhar entre 34.712 e 68.507, taxa de 37.35%
        //Se ganhar a partir de 68.507, taxa de 49.50%

        Scanner entrada = new Scanner(System.in);
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;

        System.out.print("Insira o salário anual: £");
        double salarioAnual = entrada.nextDouble();

        if (salarioAnual <= 0) {
            System.out.println("Insira um salário com valor positivo!");
        } else {
            if (salarioAnual <= 34712) {
                System.out.println("Taxa de imposto " + (primeiraFaixa * 100) + "%");
                valorImposto = salarioAnual * primeiraFaixa;
            } else if (salarioAnual <= 68507) {
                System.out.println("Taxa de imposto " + (segundaFaixa * 100) + "%");
                valorImposto = salarioAnual * segundaFaixa;
            } else {
                System.out.println("Taxa de imposto " + (terceiraFaixa * 100) + "%");
                valorImposto = salarioAnual * terceiraFaixa;
            }
            System.out.println("Total do imposto sobre o salário: £" + valorImposto);
            System.out.println("Salário após o imposto: £" + (salarioAnual - valorImposto));
        }

    }
}
