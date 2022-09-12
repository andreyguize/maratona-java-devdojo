package maratonajava.javacore.colecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(10);
        List<String> nomes2 = new ArrayList<>(10);

        nomes.add("William");
        nomes.add("DevDojo");
        nomes2.add("Suane");
        nomes2.add("Academy");
//        System.out.println("Removido? " + nomes.remove("William"));
        nomes.addAll(nomes2);

        for (String nome : nomes) {
            System.out.println(nome);
        }
        System.out.println("-----------");

        nomes.add("Andrey");
        nomes.add("Guize");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
        System.out.println("-----------");

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(4);
        numeros.add(77);
        numeros.add(120);

        for (Integer numero : numeros) {
            System.out.println(numero);
        }

    }
}
