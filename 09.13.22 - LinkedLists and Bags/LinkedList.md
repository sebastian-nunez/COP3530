# Linked List

**Definition:** a list of items, called "nodes", where each node has two fields:
One containing information/data and the one that is a reference to the next in the list (next or link)

- For a Singly-LinkedList, the last node points to null
- To iterate through LinkedList you needs an _iterator_
- The first element points to a _dummy_ node **"head"**: one extra node infront of the list

  - There is always at least 1 node on the LinkedList

> (info, next -> [info, next -> {info, null}])

## General Node Class

```java
public class Node {
    private int data;
    private Node next;

    public Node() {
        data = 0;
        next = null;
    }

    // getters/setters
    public int getData() {...}
    public void setData(int data) {...}
    public Node getNext() {...}
    public void setNext(Node node) {...}
}
```

## General LinkedList Class

```java
public class LinkedList {
    private Node head;

    public LinkedList() {...}

    public boolean isEmpty() {...}
    public void display() {...}
    public boolean search(int x) {...}

    public void add(int x) {...}
    public remove(int x) {...}
}
```

### Implementation

```java
public class LinkedList {
    private Node head;

    public LinkedList() {
        head = new Node();
    }

    public boolean isEmpty() {
        return head.getNext() == null;
    }

    public void display() {
        Node current = head.getNext();

        while (current != null) {
            // process the item
            System.out.print(current.getData() + " ");

            // advance current
            current = current.getNext();
        }

        System.out.println();
    }

    public boolean search(int x) {
        Node current = head.getNext();

        while (current != null) {
            // process the item
            if (current.getData() == x)
                return true

            // advance current
            current = current.getNext();
        }

        return false;
    }

    public void add(int x) {
        Node p = new Node();

        p.setData(x);

        // the new Node points where the last one pointed
        p.setNext(head.getNext());

        head.setNext(p);
    }

    // find the location of the node before it
    public remove(int x) {
        Node old = head.getNext();
        Node p = head;

        boolean found = false;
        while (old != null && !found) {
            if (old.getData() == x) {
                found = true;
            } else {
                p = old;
                old = p.getNext();
            }
        }

        if (found)
            p.setNext(old.getNext());
    }
}
```
