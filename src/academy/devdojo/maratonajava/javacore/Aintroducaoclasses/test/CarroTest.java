package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.setMarca("Volwskagen");
        carro1.setModelo("Fusca");
        carro1.setAno(1965);
        System.out.println(carro1.toString());

        carro2.setMarca("Fiat");
        carro2.setModelo("Palio");
        carro2.setAno(2002);
        System.out.println(carro2.toString());
    }

}
