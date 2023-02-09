package colecciones;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {

        Set<Persona> mySet = new HashSet<>();
        mySet.add(new Persona("Primal", "Scream", "1A"));
        mySet.add(new Persona("Daft", "Punk", "1B"));
        mySet.add(new Persona("Chemical", "Brothers", "2B"));
        mySet.add(new Persona("Pearl", "Jam", "2X"));
        mySet.add(new Persona("Pearl", "Jam", "3X"));
        mySet.add(new Persona("Chemical", "Brothers", "2Y"));
        mySet.add(new Persona("Deee", "Lite", "4X"));

        System.out.println(mySet);

        Set<Persona> mySet2 = new TreeSet<>(mySet);
        System.out.println(mySet2);

        Set<Persona> mySet3 = new TreeSet<>(
                (p1, p2) -> {
                    return (p1.getDni().compareTo(p2.getDni()));
                }
        );
        mySet3.addAll(mySet);
        System.out.println(mySet3);


    }
}
