package maratonajava.javacore.io.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("PastaFileTest02");
        System.out.println("Pasta criada? " + fileDiretorio.mkdir());

        File fileArquivoDiretorio = new File(fileDiretorio, "arquivo.txt");
        System.out.println("arquivo.txt criado? " + fileArquivoDiretorio.createNewFile());

        File fileRenamed = new File(fileDiretorio, "arquivo_renomeado.txt");
        System.out.println("arquivo.txt renomeado? " + fileArquivoDiretorio.renameTo(fileRenamed));

        File diretorioRenamed = new File("PastaFileTest02_renomeado");
        System.out.println("Diretorio pasta renomeado? " + fileDiretorio.renameTo(diretorioRenamed));
    }
}
