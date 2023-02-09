package colecciones;

import java.util.*;

public class Mapa {

    public static void main(String[] args) {
        Map<Integer,Persona> alumno = new LinkedHashMap<>();
        alumno.put(79,new Persona("Primal", "Scream", "1A"));
        alumno.put(53,new Persona("Daft", "Punk", "1B"));
        alumno.put(31,new Persona("Chemical", "Brothers", "2B"));
        alumno.put(11,new Persona("Pearl", "Jam", "2X"));
        alumno.put(43,new Persona("Pearl", "Jam", "3X"));
        alumno.put(67,new Persona("Chemical", "Brothers", "2Y"));
        alumno.put(29,new Persona("Deee", "Lite", "4X"));
        alumno.put(89,new Persona("Juan", "Perro", "5Z"));
        System.out.println(alumno);

        Map<Integer,Persona> alumno1 = new HashMap<>(alumno);
        System.out.println(alumno1);


        Map<Integer,Persona> alumno2 = new TreeMap<>(alumno);
        System.out.println(alumno2);

//        Map<Persona,String> nombreCodigo = new TreeMap<>();
//        nombreCodigo.put(new Persona("Primal", "Scream", "1A"),"PS");
//        nombreCodigo.put(new Persona("Daft", "Punk", "1B"),"DP");
//        nombreCodigo.put(new Persona("Chemical", "Brothers", "2B"),"CB");
//        nombreCodigo.put(new Persona("Pearl", "Jam", "2X"),"PJ");
//        nombreCodigo.put(new Persona("Pearl", "Jam", "3X"),"PJ");
//        nombreCodigo.put(new Persona("Chemical", "Brothers", "2Y"),"CB");
//        nombreCodigo.put(new Persona("Deee", "Lite", "4X"),"DL");
//        nombreCodigo.put(new Persona("Juan", "Perro", "5Z"),"JP");
//        System.out.println(nombreCodigo);

        System.out.println(alumno2.get(11));
        if (alumno2.containsKey(19))
            System.out.println("Contiene clave 19");
        if(alumno2.containsValue(new Persona("Deee","Lite","4X")))
            System.out.println("Sí está");

        System.out.println("------\n Iterando caso 1");
        Set<Integer> claveConjunto = alumno.keySet();
        Iterator<Integer> iterator = claveConjunto.iterator();
        while(iterator.hasNext()){
            Integer clave = iterator.next();
            System.out.println(alumno.get(clave));
        }

        System.out.println("------\n Iterando caso 2");
        for(Integer clave : claveConjunto)
            System.out.println(alumno.get(clave));

        System.out.println("------\n Iterando caso 3");
        Collection<Persona> personas = alumno1.values();
        for(Persona p : personas)
            System.out.println(p);

        System.out.println("------\n Iterando caso 4");
        alumno2.forEach((nia, persona) -> System.out.println(nia + " => " + persona));

        //si no queréis forEach
        Set<Map.Entry<Integer,Persona>> alumnos = alumno2.entrySet();
        for(Map.Entry<Integer,Persona> alum : alumnos) {
            Integer nia = alum.getKey();
            Persona persona = alum.getValue();
            System.out.println(nia + " => " + persona);
        }

    }

}
