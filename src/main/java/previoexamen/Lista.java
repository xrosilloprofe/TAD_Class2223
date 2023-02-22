package previoexamen;

public class Lista<T> {
    private Nodo<T> head;
    private int size;

    public Lista(){
        head = null;
        size = 0;
    }

    public int size() { return size;}

    public void add(T elem){
        Nodo<T> nodo = new Nodo<>(elem);
        if(size!=0)
            nodo.setNext(head);
        head = nodo;
        size++;
    }

    public T get(int index){
        if(index > size || index <=0)
            return null;
        Nodo<T> aux = head;
        for (int i = 1; i <=index ; i++) {
            aux = aux.getNext();
        }
        return aux.getElem();
    }


}
