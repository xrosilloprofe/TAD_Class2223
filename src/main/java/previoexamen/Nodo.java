package previoexamen;

class Nodo<T> {

    private T elem;

    public T getElem() {
        return elem;
    }
    public void setElem(T elem) {
        this.elem = elem;
    }
    public Nodo<T> getNext() {
        return next;
    }
    public void setNext(Nodo<T> next) {
        this.next = next;
    }

    private Nodo<T> next;

    public Nodo(T elem) {
        this.elem = elem;
    }

@Override
    public boolean equals(Object o){
        if(!(o instanceof Nodo))
            return false;
        Nodo<T> nodo = (Nodo) o;
        return this.elem.equals(nodo.elem);
}

}
