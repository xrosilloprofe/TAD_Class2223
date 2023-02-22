package previoexamen;

import java.util.*;
import java.util.stream.Collectors;

public class Listas {
    public static final Comparator<String> ALFABETICO = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.compareToIgnoreCase(o2);
        }
    } ;

    public static void main(String[] args) {
        List<String> ciudades = new ArrayList<>();
        ciudades.add("Valencia");
        ciudades.addAll(List.of("Barcelona","Madrid","Paris","Lyon","Londres"));
        System.out.println(ciudades);
        System.out.println(ciudades.stream().sorted().collect(Collectors.toList()));
        System.out.println(ciudades.stream().filter(String -> ciudades.contains("o")).collect(Collectors.toList()));
        ciudades.sort(ALFABETICO);
        System.out.println(ciudades);

        List<Persona> personas = new LinkedList<>();
        personas.add(new Persona("1","Uno"));
        personas.add(new Persona("2","Dos"));
        personas.add(new Persona("3","Tres"));
        personas.add(new Persona("4","Cuatro"));
        personas.add(new Persona("5","Cinco"));
        personas.add(new Persona("6","Seis"));

        Iterator<Persona> iterator = personas.iterator();
        Persona p;
        while(iterator.hasNext()){
            p = iterator.next();
            System.out.println(p);
        }

        Set<Persona> conjuntoPersonas = new HashSet<>();
        for(Persona p1 : personas ){
            conjuntoPersonas.add(p1);
        }

        for(Persona p1 : conjuntoPersonas) {
            System.out.println(p1);
        }

        Set<Persona> conjuntoOrdenado = new TreeSet<>(conjuntoPersonas);
        for(Persona p1 : conjuntoOrdenado) {
            System.out.println(p1);
        }









    }
}
