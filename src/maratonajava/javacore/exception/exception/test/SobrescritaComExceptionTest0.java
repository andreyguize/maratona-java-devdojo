package maratonajava.javacore.exception.exception.test;

import maratonajava.javacore.exception.exception.dominio.Funcionario;
import maratonajava.javacore.exception.exception.dominio.Pessoa;

public class SobrescritaComExceptionTest0 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        funcionario.salvar();
    }
}
