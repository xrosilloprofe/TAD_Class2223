package colecciones;

public class Persona implements Comparable<Persona> {

    private String nombre;
    private String apellido;
    private String dni;


    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", DNI='" + dni + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Persona))
            return false;
        Persona persona = (Persona) obj;
        return (persona.nombre.equals(this.nombre)
                && persona.apellido.equals(this.apellido)
                && persona.dni.equals(this.dni));
    }


    @Override
    public int compareTo(Persona p) {
        if (this.nombre.compareTo(p.nombre) != 0)
            return (nombre.compareTo(p.nombre));
        if (apellido.compareTo(p.apellido) != 0)
            return (apellido.compareTo(p.apellido));
        return (dni.compareTo(p.dni));
    }
}
