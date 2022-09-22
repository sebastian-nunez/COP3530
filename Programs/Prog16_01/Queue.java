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
        if (size == capacity) {
            System.out.println("Queue is Full! Unable to add '" + c + "'");
            return;
        }

        back = (back + 1) % capacity;
        list[back] = c;
        size++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        front = (front + 1) % capacity;
        size--;
    }

    public void clear() {
        front = 0;
        back = size - 1;
        size = 0;
    }

    public void print() {
        for (int i = 0; i < size; i++)
            System.out.println(list[(front + i) % capacity]);
    }

    public char getFront() {
        if (isEmpty()) {

        }

        return list[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return this.size;
    }

}
