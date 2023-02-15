package colecciones;

import java.util.*;

public class Lista {
    public static void main(String[] args) {

        //MAL porque no nombre interfaz
        ArrayList<String> miLista = new ArrayList<>();
        miLista.add("helena");
        miLista.add("jose luis");
        miLista.add("alejandro");
        miLista.add("mario");
//        imprimirLista(miLista);

        List<String> miLista2 = new ArrayList<>(miLista);
//        imprimirLista2(miLista2);

        List<String> miLista3 = new LinkedList<>(miLista);
        miLista3.addAll(miLista2);

        imprimirLista2(miLista);
        imprimirLista2(miLista2);
        imprimirLista2(miLista3);



    }

    public static void imprimirLista(ArrayList<String> lista){
        for (String elem:lista) {
            System.out.print(elem + " - ");
        }
        System.out.println();
    }
    public static void imprimirLista2(List<String> lista){
        for (String elem:lista) {
            System.out.print(elem + " - ");
        }
        System.out.println();
    }

}
