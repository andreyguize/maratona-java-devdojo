package maratonajava.javacore.String.test;

import java.util.Locale;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "       Augusto       ";
        String numeros = "012345";
        imprimeNome(nome);
        System.out.println(nome.replace("u","x"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.length());
        System.out.println(numeros.substring(0,2));
        System.out.println(numeros.substring(3));
        System.out.println();
        nome = nome.trim();
        imprimeNome(nome);
    }

    static void imprimeNome(String nome){
        for (int i = 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
        }
    }
}

