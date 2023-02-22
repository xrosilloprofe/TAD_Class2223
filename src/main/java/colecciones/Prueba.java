package colecciones;

import java.util.*;

public class Prueba {
    public static void main(String[] args) {

        List<String> coches = new ArrayList<>();
        coches.addAll(List.of("z3","golf","toledo","renault 11","seat 124","renault 5"));




        for(String coche:coches){
                System.out.println(coche.hashCode());
        }

//        Iterator<String> iterador = coches.iterator();
//        while(iterador.hasNext()){
//            String coche = iterador.next();
//            System.out.println("Coche --> " + coche);
//        }


        Set<String> cochesConjunto2 = new HashSet<>(coches);
        Set<String> cochesConjunto = new TreeSet<>(coches);
//        System.out.println(cochesConjunto);

        Map<String, String> cochePropietario = new HashMap<>();
        cochePropietario.put("tesla model 3","ian");
        cochePropietario.put("vw i3","carlos");
        cochePropietario.put("vw i4", "alejandro");
        cochePropietario.put("bmw ix3", "alejandro");

        Collection<String> cars = cochePropietario.values();
        System.out.println(cars);

        Set<String> claves = cochePropietario.keySet();
        Iterator<String> iterator = claves.iterator();
        //iterar
        for(String clave : claves){
            System.out.println(cochePropietario.get(clave));
        }

        Set<Map.Entry<String,String>> conjuntoDatos = cochePropietario.entrySet();
        for(Map.Entry<String,String> clau : conjuntoDatos)
            System.out.println(clau.getKey() + " - " + clau.getValue());



//        System.out.println(cochePropietario);




    }
}
