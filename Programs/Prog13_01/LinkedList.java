
public class LinkedList implements ListInterface {

    public class Node {

        private int info;
        private Node next;
        // private int length;

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

    public void add(int[] nums) {
        for (int i = 0; i < nums.length; i++)
            add(nums[i]);
    }

    /**
     * Removes the first occurence of "x" in the list
     */
    public void remove(int x) {
        Node old = first.getNext();
        Node p = first;

        boolean found = false;
        while (old != null) {
            if (old.getInfo() == x) {
                found = true;
                break;
            } else {
                p = old;
                old = p.getNext();
            }
        }

        if (found) {
            p.setNext(old.getNext());
        }
    }

    /**
     * Insert value 'x' into a specific index 'loc'
     */
    public void insert(int x, int loc) {
        Node current = first.getNext();

        int i = 0;
        while (current != null) {
            i++;
            System.out.println("i: " + i);
            if (i - 1 == loc) {
                Node p = new Node();
                p.setInfo(x);
                p.setNext(current.getNext());
                current.setNext(p);
                return;
            }

            current = current.getNext();
        }

        System.out.println("Invalid location!");
    }

    // TODO: Implement
    public void removeItemAt(int loc) {

    }

    public int length() {
        Node current = first.getNext();
        int length = 0;

        while (current != null) {
            length++;
            current = current.getNext();
        }

        return length;
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
