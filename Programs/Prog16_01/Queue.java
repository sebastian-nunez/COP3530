public class Queue {

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

    private char[] list;
    private int capacity;
    private int size;
    private int front, back;
}
