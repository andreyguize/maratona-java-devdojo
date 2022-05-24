package maratonajava.javacore.associacao.test;

import maratonajava.javacore.associacao.dominio.Aluno;
import maratonajava.javacore.associacao.dominio.Local;
import maratonajava.javacore.associacao.dominio.Professor;
import maratonajava.javacore.associacao.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua das Margaridas");
        Aluno aluno = new Aluno("Roger", 25);
        Aluno[] alunosParaSeminario = {aluno};
        Professor professor = new Professor("Dimitri", "Otorrinolaringologista");
        Seminario seminario = new Seminario("Entendendo as artes da vida", alunosParaSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}