package ejercicio1;

public class Pais {

    private String nombre;
    private long poblacion;

    public Pais(String nombre, long poblacion) {
        this.nombre = nombre;
        this.poblacion = poblacion;
    }

    public String getNombre() {
        return nombre;
    }

    public long getPoblacion() {
        return poblacion;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", poblacion=" + poblacion +
                '}';
    }

    @Override
    public boolean equals(Object o){
        if (!(o instanceof Pais))
            return false;
        Pais pais = (Pais) o;
        return nombre.equals(((Pais) o).getNombre());
    }


}
