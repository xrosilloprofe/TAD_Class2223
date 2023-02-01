public class Node {
    private int elem;
    private Node next;

    public Node(){
        this.next= null;
    }

    public Node(int elem){
        this.elem=elem;
        this.next=null;
    }

    public Node(int elem, Node next){
        this.elem = elem;
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public int getElem() {
        return elem;
    }

    public void setElem(int elem) {
        this.elem = elem;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString(){
        return elem + ((next!=null)?", " + next : " }");
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Node))
            return false;
        Node node = (Node) obj;
        return (node.getElem() == elem);
    }

}
