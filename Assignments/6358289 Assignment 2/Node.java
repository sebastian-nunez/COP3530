
/**
 * Implements the node of a doubly linked list of integers.
 *
 * @author Sebastian Nunez (6358289) - COP3530 U01 84883
 */
public class Node {
    private int info;
    private Node next;
    private Node prev;

    public Node() {
        this.info = 0;
        this.next = null;
        this.prev = null;
    }

    public int getInfo() {
        return this.info;
    }

    public Node getNext() {
        return this.next;
    }

    public Node getPrev() {
        return this.prev;
    }

    public void setInfo(int i) {
        this.info = i;
    }

    public void setNext(Node n) {
        this.next = n;
    }

    public void setPrev(Node p) {
        this.prev = p;
    }

}
