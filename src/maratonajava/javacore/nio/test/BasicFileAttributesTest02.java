package maratonajava.javacore.nio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta/new.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println("creationTime: " + basicFileAttributes.creationTime());
        System.out.println("lastModifiedTime: " + basicFileAttributes.lastModifiedTime());
        System.out.println("lastAccessTime: " + basicFileAttributes.lastAccessTime());
    }
}
