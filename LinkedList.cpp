#include <iostream>
#include <memory>

using namespace std;

class Node {
public:
  Node() {
    this->data = 0;
    this->next = nullptr;
  }

  int getData() {
    return this->data;
  }

  void setData(int data) {
    this->data = data;
  }

  shared_ptr<Node> getNext() {
    return this->next;
  }

  void setNext(shared_ptr<Node> node) {
    this->next = node;
  }

private:
  int data;
  shared_ptr<Node> next;
};

class LinkedList {
public:
  LinkedList() {
    this->head = make_shared<Node>(new Node());
  }

  bool isEmpty() {
    return head->getNext() == nullptr;
  }

private:
  shared_ptr<Node> head;
};

int main() {
  auto list = make_unique<LinkedList>();
  cout << "isEmpty(): " << list->isEmpty() << "\n";
}
