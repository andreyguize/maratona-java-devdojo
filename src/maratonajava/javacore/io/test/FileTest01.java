package maratonajava.javacore.io.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            System.out.println("Created? " + file.createNewFile());
            System.out.println(file.getAbsolutePath());
            System.out.println("Is Directory? " + file.isDirectory());
            System.out.println("Is File? " + file.isFile());
            System.out.println("Is Hidden? " + file.isHidden());
            System.out.println("Last Modified " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
            boolean exists = file.exists();
            if (exists){
                System.out.println("Deleted? " + file.delete());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
