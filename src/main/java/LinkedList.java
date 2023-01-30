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

}
