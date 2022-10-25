# Binary Search Trees

## Structures

- Values to the **left** are **less** than the parent
- Values to the **right** are **greather** than the parent
- **"Balanced (height(T) = O(logn)"**: height of the left and right subtrees is almost the same

```bash
       k
    /     \
  x<k     x>k
```

## 1. Example of BST

```bash
            25
        /       \
       5          37
        \       /    \
         8     29     42
       /   \     \
      6     9    27
```

## Node Class

- Data
- Left Subtree
- Right Subtree

## Searching in BST

> For a balanced tree, searching: O(logn)

- if (x == info at node) FOUND!
- if (x < info at node) Search the **LEFT** subtree recursively
- if (x > info at node) Search the **RIGHT** subtree recursively

## Implementation

```java
public class BinarySearchTree {
    public BinarySearchTree() {...}
    public boolean isEmpty() {...}
    public void display() {...}
    public boolean contains(int x) {...}
    public void add(int x) {...}
    public int getMin() {...}

    private Node root;
    private void inorderDisplay(Node p) {...}
    private boolean search(int x, Node p) {...}
    private void insert(int x, Node p) {...}
    private int getMin(Node p) {...}
}
```
