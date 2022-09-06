package maratonajava.javacore.io.test;

/*
File
FileWriter
FileReader
BufferedWriter
BufferedReader
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try (FileWriter fw = new FileWriter(file,true)){
            fw.write("O DevDojo é o curso de Java mais completo do Brasil, sem dúvidas!\nPróxima linha\n");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
