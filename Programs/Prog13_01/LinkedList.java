
public class LinkedList implements ListInterface {

    public class Node {

        private int info;
        private Node next;

        public Node() {
            info = 0;
            next = null;
        }

        public void setInfo(int i) {
            info = i;
        }

        public void setNext(Node l) {
            next = l;
        }

        public int getInfo() {
            return info;
        }

        public Node getNext() {
            return next;
        }
    }

    private Node first;

    public LinkedList() {
        first = new Node();
    }

    public boolean isEmpty() {
        return (first.getNext() == null);
    }

    public void display() {
        Node current = first.getNext();

        while (current != null) {
            System.out.print(current.getInfo() + " ");
            current = current.getNext();
        }

        System.out.println();
    }

    public boolean search(int x) {
        Node current = first.getNext();

        while (current != null) {
            if (current.getInfo() == x) {
                return true;
            }
            current = current.getNext();
        }

        return false;
    }

    public void add(int x) {
        Node p = new Node();

        p.setInfo(x);
        p.setNext(first.getNext());

        first.setNext(p);
    }

    public void remove(int x) {
        Node old = first.getNext(),
                p = first;

        boolean found = false;
        while (old != null && !found) {
            if (old.getInfo() == x) {
                found = true;
            } else {
                p = old;
                old = p.getNext();
            }
        }

        if (found) {
            p.setNext(old.getNext());
        }
    }

    // TODO: Implement
    public void insert(int x, int loc) {

    }

    // TODO: Implement
    public void removeItemAt(int loc) {

    }

    public void clear() {
        first = new Node();
    }

    @Override
    public String toString() {
        Node current = first.getNext();
        String output = "";

        while (current != null) {
            output += current.getInfo() + " ";

            current = current.getNext();
        }

        return output;
    }
}
