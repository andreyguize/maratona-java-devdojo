package maratonajava.javacore.polimorfismo.servico;

import maratonajava.javacore.polimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memória");
    }
}
