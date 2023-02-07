package generics;

import java.util.Arrays;

public class Test {

        public static void main(String args[]) {

            GenericLinkedList<Double> list = new GenericLinkedList<>();
            System.out.println("Es vacía?: " + ((list.isEmpty())?"Sí":"No"));
            System.out.println("Tamaño: " + list.size());
            System.out.println(list.toString() + " cabeza: " + list.getHead() + " cola: " + list.getTail());

            list.addHead(5.0);
            System.out.println("Es vacía?: " + ((list.isEmpty())?"Sí":"No"));
            System.out.println(list.toString() + " cabeza: " + list.getHead().getElem() + " cola: " + list.getTail().getElem());

            list.addTail(73.0);
            System.out.println(list.toString() + " cabeza: " + list.getHead().getElem() + " cola: " + list.getTail().getElem());

            list.addHead(2.0);
            System.out.println(list.toString() + " cabeza: " + list.getHead().getElem() + " cola: " + list.getTail().getElem());

            list.addHead(3.0);
            list.addHead(7.0);
            list.addHead(11.0);
            list.addHead(13.0);
            System.out.println(list.toString() + " cabeza: " + list.getHead().getElem() + " cola: " + list.getTail().getElem());

            Double[] vector = list.toArray(Double.class);
            System.out.println(Arrays.toString(vector));

            list.remove(0);
            list.remove(-1);
            list.remove(10);
            System.out.println(list.toString() + " cabeza: " + list.getHead().getElem() + " cola: " + list.getTail().getElem());
            list.remove(5);
            System.out.println(list.toString() + " cabeza: " + list.getHead().getElem() + " cola: " + list.getTail().getElem());
            list.remove(2);
            System.out.println(list.toString() + " cabeza: " + list.getHead().getElem() + " cola: " + list.getTail().getElem());

            System.out.println(list.search(13.0));
            System.out.println(list.search(11.0));
            System.out.println(list.search(5.0));

            System.out.println(list.contains(13.0));
            System.out.println(list.contains(11.0));
            System.out.println(list.contains(5.0));

            System.out.println(list.get(0));
            System.out.println(list.get(-1));
            System.out.println(list.get(4));
            System.out.println(list.get(3));
            System.out.println(list.toString() + " cabeza: " + list.getHead().getElem() + " cola: " + list.getTail().getElem());

            GenericLinkedList<Double> list1 = new GenericLinkedList<>();
            list1.addAll(list);
            System.out.println(list1.toString() + " cabeza: " + list1.getHead().getElem() + " cola: " + list1.getTail().getElem());
            System.out.println(list1.equals(list));
            list1.clear();
            System.out.println(list1.equals(list));
            System.out.println(list1.toString());
            System.out.println(list.toString());


            GenericLinkedList<String> listString = new GenericLinkedList<>();
            System.out.println("Es vacía?: " + ((listString.isEmpty())?"Sí":"No"));
            System.out.println("Tamaño: " + listString.size());
            System.out.println(listString.toString() + " cabeza: " + listString.getHead() + " cola: " + listString.getTail());

            listString.addHead("jesus");
            System.out.println("Es vacía?: " + ((listString.isEmpty())?"Sí":"No"));
            System.out.println(listString.toString() + " cabeza: " + listString.getHead().getElem() + " cola: " + listString.getTail().getElem());

            listString.addTail("carlos");
            System.out.println(listString.toString() + " cabeza: " + listString.getHead().getElem() + " cola: " + listString.getTail().getElem());

            listString.addHead("salman");
            System.out.println(listString.toString() + " cabeza: " + listString.getHead().getElem() + " cola: " + listString.getTail().getElem());

            listString.addHead("ian");
            listString.addHead("lia");
            listString.addHead("ruben");
            listString.addHead("alejandro");
            System.out.println(listString.toString() + " cabeza: " + listString.getHead().getElem() + " cola: " + listString.getTail().getElem());

            String[] vector2 = listString.toArray(String.class);
            System.out.println(Arrays.toString(vector2));

            listString.remove(0);
            listString.remove(-1);
            listString.remove(10);
            System.out.println(listString.toString() + " cabeza: " + listString.getHead().getElem() + " cola: " + listString.getTail().getElem());
            listString.remove(5);
            System.out.println(listString.toString() + " cabeza: " + listString.getHead().getElem() + " cola: " + listString.getTail().getElem());
            listString.remove(2);
            System.out.println(listString.toString() + " cabeza: " + listString.getHead().getElem() + " cola: " + listString.getTail().getElem());

            System.out.println(listString.search("alejandro"));
            System.out.println(listString.search("ruben"));
            System.out.println(listString.search("ian"));

            System.out.println(listString.contains("alejandro"));
            System.out.println(listString.contains("ruben"));
            System.out.println(listString.contains("ian"));

            System.out.println(listString.get(0));
            System.out.println(listString.get(-1));
            System.out.println(listString.get(4));
            System.out.println(listString.get(3));
            System.out.println(listString.toString() + " cabeza: " + listString.getHead().getElem() + " cola: " + listString.getTail().getElem());

            GenericLinkedList<String> listString1 = new GenericLinkedList<>();
            listString1.addAll(listString);
            System.out.println(listString1.toString() + " cabeza: " + listString1.getHead().getElem() + " cola: " + listString1.getTail().getElem());
            System.out.println(listString1.equals(listString));
            listString1.clear();
            System.out.println(listString1.equals(listString));
            System.out.println(listString1.toString());
            System.out.println(listString.toString());


        }



    }
