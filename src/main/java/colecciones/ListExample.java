package colecciones;

import java.util.*;


public class ListExample {
    public static void main(String[] args) {
        List<Persona> myList = new LinkedList<>();

        myList.add(new Persona("Primal","Scream","1A"));
        myList.add(new Persona("Daft","Punk","1B"));
        myList.add(new Persona("Chemical","Brothers","2B"));
        myList.add(new Persona("Pearl","Jam","2X"));
        myList.add(new Persona("Pearl","Jam","3X"));
        myList.add(new Persona("Chemical","Brothers","2Y"));
        myList.add(new Persona("Deee","Lite","2X"));

//        for(Persona persona:myList) {
////            if(persona.getNombre().contains("P"))
////                myList.remove(persona);
//            System.out.println("Grupo=> " + persona);
//        }

        Iterator<Persona> iterator = myList.iterator();
        Persona persona;
        while(iterator.hasNext()){
            persona = iterator.next();
            if(persona.getNombre().contains("P"))
                iterator.remove();
        }
        System.out.println(myList);

        Collections.sort(myList, (p1,p2)-> p1.getDni().compareTo(p2.getDni()));
        System.out.println(myList);
        Collections.sort(myList, Persona::compareTo);
        System.out.println(myList);


    }
}
