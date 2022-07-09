package maratonajava.javacore.exception.runtime.test;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        try{
            divisao(1,0);
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("Código continua normalmente...");
    }

    /**
     *
     * @param a
     * @param b não pode ser zero
     * @return
     * @throws IllegalArgumentException caso b seja zero
     */

    private static int divisao(int a, int b){
        if (b==0){
            throw new IllegalArgumentException("Argumento ilegal: não pode ser 0!");
        }
        return a/b;
    }

}
