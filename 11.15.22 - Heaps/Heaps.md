# Heap

> A heap is a binary tree that satisfies two additional properties: the complete binary tree property and heap-order property

- **Complete Binary Tree Property**: the heap is a binary tree that is completely filled in each level, except for possibly the bottom level, which is filled from left to right.

- **Heap-Order Property**: The key at each node is smaller than or equal to the keys stored in the left and right subtrees of the nodes (min heap) -> the parent is less than its children

## Locating Children (arithmetically)

If the value of the node is at position **"i"** in the array:

- **Left child:** position **"2 \* i"**
- **Right child:** position **"2 \* i + 1**

- **Parent (from left child):** position **"i // 2"**
- **Parent (from right child):** position **"(i - 1) // 2"**

## Purpose of Heaps

- Add an element: O(log n)
- Remove the minimum: O(log n)
- Report the minimum: O(1)

> Could be switched around made a max-heap

## What can we do with Heaps?

### Priority Queue

- add element "e" with a particular priority "n"
- max: returns (but does not delete) an element with the highest priority
- removeMax: removes the element with the highest priority

### Heapsort

- Heapsort: add all elements to a heap, removeMin until heap is empty O(n log n)

## Adding to a Heap (Bubble Up)

- Add the end of the heap
- Bubble up (swap values until you get to the beginning)

```java
public void add(int x) {
    int loc = length++;

    list[0] = x;
    while (x < list[loc / 2]) { // would be parent: bubbles down if greater than the new element
        list[loc] = list[loc / 2];
        loc /= 2;
    }

    list[loc] = x; // new element placed in the child once parent is found
}
```

## Removing the Min Element

- Swap the last element with the first
- Bubble down into the correct position
