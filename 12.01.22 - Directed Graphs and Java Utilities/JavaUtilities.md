# Java Utilities

> The Java class Library, ADTs and Algorithms

## java.util

> uses Java Generics, Iterators, Inheritance Web

- **ArrayList:** not synchronized (doubly LinkedList)
- **Vector:** synchronized (prevent RACE conditions) -> more inefficient
- **LinkedList**
- **Stack** (inherits from Vector class)
- **Queue**
- **Arrays.sort(sorting algorithm)** (quicksort, sorts in place, for custom classes must use the Comparable interface)
- **PriorityQueue:** (implemented using a min-Heap)
- **HashSet:** (implements set interface, must you an iterator)
- **heapSort**: uses a heap

## Generics

```java
public class ArrayBag<T> {
    private int length;
    private T[] bag;
    private int size;

    public ArrayBag() {
        size = 10;
        bag = (T[]) new Object[size];
        length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void add(T item) {
        if (length == size) {
            bag = Arrays.copyOf(bag, 2 * size);
        }

        bag[length++] = item;
    }

    public void remove(T item) {
        for (int i = 0; i < length; i++) {
            if (bag[i].equals(item)) {
                bag[i] = bag[--length];
                break;
            }
        }
    }
}
```
