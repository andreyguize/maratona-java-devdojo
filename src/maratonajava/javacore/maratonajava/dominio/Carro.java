package maratonajava.javacore.maratonajava.dominio;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    public static double velocidadeLimite;

    public Carro() {
    }

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite(){
        return velocidadeLimite;
    }

    @Override
    public String toString() {
        return "ExercicioCarro{" + "nome='" + marca + '\'' + ", modelo='" + modelo + '\'' + ", ano=" + ano + '}';
    }
}
