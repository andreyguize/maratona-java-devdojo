package academy.devdojo.maratonajava.introducao;

public class ExercicioNumerosPares {
    public static void main(String[] args) {
        //imprimir números pares de 0 até 1000000
        
        for (int i=0; i<=1000000; i++){
            if (i % 2 == 0){
                System.out.println("i = " + i);
            }
        }
    }
}
