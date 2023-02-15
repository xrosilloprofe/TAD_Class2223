package ejercicio1;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Trabajador,Pais> plantilla = new HashMap<>();
        Trabajador t1 = new Trabajador("1Z","pepe","saez", LocalDate.of(1966,2,28));
        Trabajador t2 = new Trabajador("2Z","arcadio","moreno", LocalDate.of(1967,2,28));
        Trabajador t3 = new Trabajador("3Z","antonio","lopez", LocalDate.of(1968,2,28));
        Trabajador t4 = new Trabajador("4Z","javier","soriano", LocalDate.of(1969,2,28));
        Trabajador t5 = new Trabajador("5Z","raul","mulder", LocalDate.of(1986,2,28));

        Pais p1 = new Pais("España", 47000000);
        Pais p2 = new Pais("Alemania", 83000000);
        Pais p3 = new Pais("Francia", 72000000);

        plantilla.put(t1,p1);
        plantilla.put(t1,p1);
        plantilla.put(t1,p2);
        plantilla.put(t1,p3);
        plantilla.put(t1,p3);

        //Obtener un listado de solo las nacionalidades de la empresa.


    }
}
