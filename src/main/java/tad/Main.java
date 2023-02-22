package tad;

import java.util.Arrays;

public class Main {

    public static void main(String args[]) {

        LinkedList list = new LinkedList();
        System.out.println("Es vacía?: " + ((list.isEmpty())?"Sí":"No"));
        System.out.println("Tamaño: " + list.size());
        System.out.println(list.toString() + " cabeza: " + list.getHead() + " cola: " + list.getTail());

        list.addHead(5);
        System.out.println("Es vacía?: " + ((list.isEmpty())?"Sí":"No"));
        System.out.println(list.toString() + " cabeza: " + list.getHead().getElem() + " cola: " + list.getTail().getElem());

        list.addTail(73);
        System.out.println(list.toString() + " cabeza: " + list.getHead().getElem() + " cola: " + list.getTail().getElem());

        list.addHead(2);
        System.out.println(list.toString() + " cabeza: " + list.getHead().getElem() + " cola: " + list.getTail().getElem());

        list.addHead(3);
        list.addHead(7);
        list.addHead(11);
        list.addHead(13);
        System.out.println(list.toString() + " cabeza: " + list.getHead().getElem() + " cola: " + list.getTail().getElem());

        int[] vector = list.toArray();
        System.out.println(Arrays.toString(vector));

        list.remove(0);
        list.remove(-1);
        list.remove(10);
        System.out.println(list.toString() + " cabeza: " + list.getHead().getElem() + " cola: " + list.getTail().getElem());
        list.remove(5);
        System.out.println(list.toString() + " cabeza: " + list.getHead().getElem() + " cola: " + list.getTail().getElem());
        list.remove(2);
        System.out.println(list.toString() + " cabeza: " + list.getHead().getElem() + " cola: " + list.getTail().getElem());

        System.out.println(list.search(13));
        System.out.println(list.search(11));
        System.out.println(list.search(5));

        System.out.println(list.contains(13));
        System.out.println(list.contains(11));
        System.out.println(list.contains(5));

        System.out.println(list.get(0));
        System.out.println(list.get(-1));
        System.out.println(list.get(4));
        System.out.println(list.get(3));
        System.out.println(list.toString() + " cabeza: " + list.getHead().getElem() + " cola: " + list.getTail().getElem());

        LinkedList list1 = new LinkedList();
        list1.addAll(list);
        System.out.println(list1.toString() + " cabeza: " + list1.getHead().getElem() + " cola: " + list1.getTail().getElem());
        System.out.println(list1.equals(list));
        list1.clear();
        System.out.println(list1.equals(list));
        System.out.println(list1.toString());
        System.out.println(list.toString());
    }



}