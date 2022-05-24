package maratonajava.javacore.polimorfismo.test;

import maratonajava.javacore.polimorfismo.repositorio.Repositorio;
import maratonajava.javacore.polimorfismo.servico.RepositorioArquivo;
import maratonajava.javacore.polimorfismo.servico.RepositorioBancoDeDados;
import maratonajava.javacore.polimorfismo.servico.RepositorioMemoria;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();

        List<String> list = new LinkedList<>();
        list.add("Goku");
        list.add("Vegeta");
        list.add("Kuririn");
        System.out.println(list);
    }
}
