
/**
 * Implements the node of a singly linked list of ElementType.
 *
 * @author (add here full name(s), Panther ID(s), and class section(s))
 */
public class Node {

    private ElementType info; // element stored in this node
    private Node next; // link to next node in the list

    /**
     * Default constructor. Creates a default node object.
     */
    public Node() {
        this.info = new ElementType();
        this.next = null;
    }

    public void setInfo(ElementType x) {
        this.info = x;
    }

    public void setNext(Node l) {
        this.next = l;
    }

    public ElementType getInfo() {
        return this.info;
    }

    public Node getNext() {
        return this.next;
    }
}
