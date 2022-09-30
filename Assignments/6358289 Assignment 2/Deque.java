/**
 * The class Deque implements a double-ended queue with a doubly linked list.
 * The list uses a header and a trailer (dummy) nodes.
 *
 * @author Sebastian Nunez (6358289) - COP3530 U01 84883
 */
public class Deque {
    private int count; //number of elements in the deque
    private Node back; //points to the item in the back
    private Node front; //points to the item in the front

    /**
     * Default constructor. Sets this object as an empty deque.
     *
     */
    public Deque() {
        front = new Node();
        back = new Node();
        front.setNext(back);
        back.setPrev(front);
        count = 0;
    }

    /**
     * Adds new element to the back end of the deque. The method takes O(1)
     * time.
     *
     * @param x new element to be added to the deque.
     */
    public void addToBack(int x) {
        // new node
        Node ptr = new Node();
        ptr.setInfo(x);

        // adjust the new prev node to point to the new node (and vice versa )
        Node prev = back.getPrev();
        ptr.setPrev(prev);
        prev.setNext(ptr);

        // adjust the new node to point to the tail (and vise versa)
        ptr.setNext(back);
        back.setPrev(ptr);

        count++;
    }

    /**
     * Adds new element to the front end of the deque. The method takes O(1)
     * time.
     *
     * @param x new element to be added to the deque.
     */
    public void addToFront(int x) {
        // new node
        Node ptr = new Node();
        ptr.setInfo(x);

        // adjust the new next node to point to the new node (and vice versa )
        Node next = front.getNext();
        ptr.setNext(next);
        next.setPrev(ptr);

        // adjust the head to point to the new node (and vice versa)
        front.setNext(ptr);
        ptr.setPrev(front);

        count++;
    }

    /**
     * Retrieves element on the back end of the deque. The method takes O(1)
     * time.
     *
     * @return operation is successful: valid = true and item = element on the
     * back end; operation is unsuccessful (i.e. empty deque): valid = false and
     * item = dummy value
     */
    public DequeItem getBack() {
        if (isEmpty())
            return new DequeItem();

        Node last = back.getPrev();

        return new DequeItem(true, last.getInfo());
    }

    /**
     * Retrieves element on the front end of the deque. The method takes O(1)
     * time.
     *
     * @return operation is successful: valid = true and item = element on the
     * front end; operation is unsuccessful (i.e. empty deque): valid = false and
     * item = dummy value
     */
    public DequeItem getFront() {
        if (isEmpty())
            return new DequeItem();

        Node first = front.getNext();

        return new DequeItem(true, first.getInfo());
    }

    /**
     * Determines if deque is empty. The method takes O(1) time.
     *
     * @return true if deque contains no elements, false otherwise.
     */
    public boolean isEmpty() {
        return count == 0;
    }

    /**
     * Removes element on the back end of the deque. The method takes O(1) time.
     *
     * @return false if removal cannot be performed (i.e. the deque is empty),
     * true otherwise
     */
    public boolean removeBack() {
        if (isEmpty())
            return false;

        Node removed = back.getPrev(); // node to be removed
        Node prev = removed.getPrev(); // new previous node

        // new previous points to the back (and vice versa)
        prev.setNext(back);
        back.setPrev(prev);

        count--;
        return true;
    }

    /**
     * Removes element on the front end of the deque. The method takes O(1)
     * time.
     *
     * @return false if removal cannot be performed (i.e. the deque is empty),
     * true otherwise
     */
    public boolean removeFront() {
        if (isEmpty())
            return false;

        Node removed = front.getNext(); // node to be removed
        Node next = removed.getNext(); // new next node

        // the head now points to the new node (and vice versa)
        front.setNext(next);
        next.setPrev(front);

        count--;
        return true;
    }

    /**
     * Constructs a String description of the deque.
     *
     * @return String containing the deque elements.
     */
    public String toString() {
        String str = "";

        Node current = front.getNext();
        for (int i = 0; i < count - 1; i++) {
            str += current.getInfo() + ", ";
            current = current.getNext();
        }

        if (count != 0)
            return "Deque: [" + str + back.getPrev().getInfo() + "]";
        else
            return "Deque: []";
    }
}
