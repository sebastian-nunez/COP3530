#include <iostream>

using namespace std;

const int capacity = 100;

template <class T>
struct Queue {
  T queue[capacity];
  int size;
  int front;
  int back;

  Queue() {
    this->size = 0;
    this->front = 0;
    this->back = 0;
  }

  void enqueue(T data) {
    back = (back + 1) % capacity;
    queue[back] = data;
    size++;
  }

  T dequeue() {
    if (is_empty()) {
      cout << " -- Queue is empty.\n";
      return 0;
    }
    front = (front + 1) % capacity;
    size--;

    return queue[front];
  }

  bool is_empty() {
    return this->size == 0;
  }
};

int main() {
  Queue<int> queue;

  queue.enqueue(1);
  queue.enqueue(2);
  queue.enqueue(3);

  queue.enqueue(10);
  queue.enqueue(20);
  queue.enqueue(30);

  cout << "Contents of integer queue intQueue1: ";
  for (int i = 0; i < 3; i++)
    cout << queue.dequeue() << " ";
  cout << "\n";

  cout << "Contents of integer queue intQueue2: ";
  for (int i = 0; i < 3; i++)
    cout << queue.dequeue() << " ";
  cout << "\n";

  Queue<double> queue2;  // create two double queues

  queue2.enqueue(1.01);
  queue2.enqueue(2.02);
  queue2.enqueue(3.03);

  queue2.enqueue(10.01);
  queue2.enqueue(20.02);
  queue2.enqueue(30.03);

  cout << "Contents of double queue doubleQueue1: ";
  for (int i = 0; i < 3; i++)
    cout << queue2.dequeue() << " ";
  cout << "\n";

  return 0;
}
