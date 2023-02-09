package colecciones;

import com.sun.source.tree.Tree;

import java.util.*;

public class Conjunto {

    public static void main(String[] args) {
        Set<Integer> conjunt = new HashSet<>();
        conjunt.addAll(Set.of(13,29,23,17));
        conjunt.add(73);
        conjunt.add(53);
        conjunt.add(13);
        System.out.println(conjunt);

        Set<Integer> conjunt2 = new LinkedHashSet<>(conjunt);
        conjunt2.addAll(Set.of(13,29,23,17));
        conjunt2.add(73);
        conjunt2.add(53);
        conjunt2.add(13);
        System.out.println(conjunt2);

        Set<Integer> conjunt3 = new TreeSet<>(conjunt);
        System.out.println(conjunt3);

        System.out.println(conjunt2.contains(13));
        System.out.println(conjunt2.equals(conjunt3));

    }

}
