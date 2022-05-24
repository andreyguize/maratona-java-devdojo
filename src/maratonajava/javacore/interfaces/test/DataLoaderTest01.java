package maratonajava.javacore.interfaces.test;

import maratonajava.javacore.interfaces.dominio.DataLoader;
import maratonajava.javacore.interfaces.dominio.DatabaseLoader;
import maratonajava.javacore.interfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        databaseLoader.retrieveMaxDataSize();
    }
}
