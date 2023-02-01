public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int size() { return size;}
    public Node getHead() { return head;}
    public Node getTail() {
        return tail;
    }

    public boolean isEmpty() { return size==0;}

    public void addHead(int elem){
    Node node = new Node(elem);
    if(isEmpty()){
        head=node;
        tail=node;
    } else {
        node.setNext(head);
        head = node;
    }
    size++;
    }

    public void addTail(int elem){
        Node node = new Node(elem);
        if(isEmpty()){
            head=node;
            tail=node;
        } else {
            tail.setNext(node);
            tail = node;
        }
        size++;
    }

    public int search(int elem){
        int result = -1;
        if(isEmpty())
            return result;
        Node node = head;
        for (int i = 0; i < size; i++) {
            if(node.getElem()==elem)
                return i;
            node = node.getNext();
        }
        return result;
    }

    public int[] toArray(){
        int[] vector = new int[size];
        Node node = head;
        for (int i = 0; i < size; i++) {
            vector[i] = node.getElem();
            node = node.getNext();
        }
        return vector;
    }

    public Integer remove(int index){
        Integer result = null;
        if(isEmpty() || index < 0 || index>=size)
            return result;
        Node node;
        boolean tailChange = (index == size-1);
        if(index==0){
            result = head.getElem();
            head = head.getNext();
        } else {
            Node aux1 = head;
            Node aux2 = head.getNext();
            while(index>1){
                aux1 = aux2;
                aux2 = aux2.getNext();
                index--;
            }
            result = aux2.getElem();
            aux1.setNext(aux2.getNext());
            if(tailChange)
                tail = aux1;
        }
        size--;
        return result;
    }

    public Integer get(int index){
        Integer result = null;
        if (isEmpty() || index <0 || index>=size)
            return result;
        Node node = head;
        while(index>0){
            node = node.getNext();
            index--;
        }
//        for (int i = 0; i <= index; i++) {
//            node = node.getNext();
//        }
        result = node.getElem();
        return result;
    }

    public void clear(){
        head = null;
        tail = null;
        size = 0;
    }

    public boolean addAll(LinkedList list){
        boolean updated = false;
        Node node = list.getHead();

        for (int i = 0; i < list.size(); i++) {
            addTail(node.getElem());
            node = node.getNext();
            updated = true;
        }
        return updated;
    }

    @Override
    public boolean equals(Object obj){
    if(!(obj instanceof LinkedList))
        return false;
    LinkedList list = (LinkedList) obj;

    if(list.size() != this.size)
        return false;

    Node aux1 = this.head;
    Node aux2 = list.getHead();

    while(aux1 != null){
        if(!aux1.equals(aux2))
            return false;
        aux1 = aux1.getNext();
        aux2 = aux2.getNext();
    }
        return true;
    }

    @Override
    public String toString(){
        return "{ size: " + size + ", Element: " + ((head==null) ? "}" : head.toString());
    }

    public boolean contains(int elem){
        Node node = head;
        for (int i = 0; i < size; i++) {
            if(elem == node.getElem())
                return true;
            node = node.getNext();
        }
        return false;
    }


}
