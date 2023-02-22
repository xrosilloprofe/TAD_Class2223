package previoexamen;

public class Persona implements Comparable<Persona>{
    private String nombre;
    private String DNI;

    public Persona(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                '}';
    }


    @Override
    public int compareTo(Persona o) {
        return this.DNI.compareTo(o.getDNI());
    }
}
