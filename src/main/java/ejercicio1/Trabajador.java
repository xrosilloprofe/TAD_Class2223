package ejercicio1;

import java.time.LocalDate;
import java.util.Objects;

public class Trabajador implements Comparable<Trabajador>{
    private String DNI;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;

    public Trabajador(String DNI, String nombre, String apellido, LocalDate fechaNacimiento) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "DNI='" + DNI + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trabajador trabajador = (Trabajador) o;
        return DNI.equals(trabajador.getDNI());
    }

    @Override
    public int hashCode() {
        return Objects.hash(DNI);
    }

    @Override
    public int compareTo(Trabajador trabajador) {
        return this.DNI.compareTo(trabajador.getDNI());
    }
}
