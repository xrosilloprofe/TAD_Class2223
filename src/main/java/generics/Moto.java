package generics;

public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String matricula, int cilindrada) {
        super(matricula);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }
}
