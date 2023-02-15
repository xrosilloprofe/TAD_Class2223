package ejercicio1;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Trabajador,Pais> plantilla = new HashMap<>();
        Trabajador t1 = new Trabajador("1Z","pepe","saez", LocalDate.of(1996,2,28));
        Trabajador t2 = new Trabajador("2Z","arcadio","moreno", LocalDate.of(1957,2,28));
        Trabajador t3 = new Trabajador("3Z","antonio","lopez", LocalDate.of(1978,2,28));
        Trabajador t4 = new Trabajador("4Z","javier","soriano", LocalDate.of(1969,2,28));
        Trabajador t5 = new Trabajador("5Z","raul","mulder", LocalDate.of(1986,2,28));

        Pais p1 = new Pais("España", 47000000);
        Pais p2 = new Pais("Alemania", 83000000);
        Pais p3 = new Pais("Francia", 72000000);

        plantilla.put(t1,p1);
        plantilla.put(t2,p1);
        plantilla.put(t3,p2);
        plantilla.put(t4,p3);
        plantilla.put(t5,p3);

        //Obtener un listado de solo las nacionalidades de la empresa.
        // solucion 1
        Collection<Pais> pais = plantilla.values();
//        System.out.println(pais);

        Set<Trabajador> trabajadorSet = plantilla.keySet();
        for(Trabajador t : trabajadorSet)
            System.out.println(plantilla.get(t));

// Listado de solo los trabajadores ordenados por su orden natural
// Esto lo deberemos hacer al menos de dos maneras diferentes.
// Por ejemplo, mediante un TreeSet y un ArrayList

        Set<Trabajador> trabajadoresOrdenados = new TreeSet<>(plantilla.keySet());
//        System.out.println(trabajadoresOrdenados);

        List<Trabajador> trabajadorList = new ArrayList<>(plantilla.keySet());
//        trabajadorList.sort(Trabajador::compareTo);
        trabajadorList.sort(Trabajador.SORT_BY_NAME);
        System.out.println(trabajadorList);

        //Listado de las nacionalidades por orden alfabético y sus trabajadores por edad.
        List<Pais> paises = new ArrayList<>(plantilla.values());
        paises.sort(Pais::compareTo);
        System.out.println(paises);
        trabajadorList.sort(Trabajador.SORT_BY_AGE);
        System.out.println(trabajadorList);

        Map<Pais,Set<Trabajador>> paisesTrabajador = new TreeMap<>();
        Pais pais1;

        for(Trabajador trabajador:trabajadorSet){
            pais1 = plantilla.get(trabajador);

            if(paisesTrabajador.containsValue(pais1))
                paisesTrabajador.get(pais1).add(trabajador);
            else {
                Set<Trabajador> t = new TreeSet<>(Trabajador.SORT_BY_AGE);
                t.add(trabajador);
                paisesTrabajador.put(pais1,t);
            }
        }

        System.out.println(paisesTrabajador);

        //Recorrer todos los trabajadores y mostrar
        // solo aquellos con edad superior a 50 años utilizando un iterador.
        for(Trabajador treballador: plantilla.keySet())
            if(LocalDate.now().getYear() - treballador.getFechaNacimiento().getYear() >= 50)
                System.out.println(treballador);

        Iterator<Trabajador> iterator = plantilla.keySet().iterator();
        while(iterator.hasNext()){
            Trabajador t = iterator.next();
            if(LocalDate.now().getYear() - t.getFechaNacimiento().getYear() >= 50)
                System.out.println(t);
        }
    }
}
