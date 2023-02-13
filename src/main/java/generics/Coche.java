package generics;

public class Coche extends Vehiculo{
    private String plazas;

    public Coche(String matricula, String plazas) {
        super(matricula);
        this.plazas = plazas;
    }

    public String getPlazas() {
        return plazas;
    }
}
