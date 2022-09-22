# Queues - First In, First Out (FIFO)

- Insert from one end, remove from the other end

## Definition

The _queue_ ADT consits of a collection of homogenous (same type) elements and two basic operations: insert and delete

- **Enqueue**: insertion of a new element in the back or rear of the queue
- **Dequeue**: deletion of the front or first element
- Use a **'size'** to keep track of the length of the queue (empty vs. full)
- use **'% CAPACITY'** to implement circularity

## Circular Queue

- If the queue reaches the end of the array, you can loop the 'back' pointer to the beginning:

  - back = (back + 1) % CAPACITY // % when you reach the end, back will be zero
  - front = (front + 1) % CAPACITY

- **Note: % number between 0 and n - 1**

### Implementation Using Arrays

```java
public class Queue {
    private char[] list;
    private int capacity;
    private int size;
    private int front, back;

    public Queue() {
        capacity = 100;
        list = new char[capacity];

        front = 0;
        back = capacity - 1;

        size = 0;
    }

    public Queue(int s) {
        capacity = s;
        list = new char[capacity];

        front = 0;
        back = capacity - 1;

        size = 0;
    }

    public void enqueue(char c) {
        back = (back + 1) % capacity;
        list[back] = c;
        size++;
    }

    public void dequeue() {
        front = (front + 1) % capacity;
        size--;
    }

    public char getFront() {
        return list[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
```
