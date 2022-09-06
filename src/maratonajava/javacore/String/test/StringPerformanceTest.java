package maratonajava.javacore.String.test;

public class StringPerformanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(100_000);
        long fim = System.currentTimeMillis();
        System.out.println(fim-inicio + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(1_000_000);
        fim = System.currentTimeMillis();
        System.out.println(fim-inicio + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(1_000_000);
        fim = System.currentTimeMillis();
        System.out.println(fim-inicio + "ms");
    }

    private static void concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    private static void concatStringBuilder(int tamanho){
        StringBuilder sbuilder = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sbuilder.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho){
        StringBuffer sbuffer = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sbuffer.append(i);
        }
    }

}
