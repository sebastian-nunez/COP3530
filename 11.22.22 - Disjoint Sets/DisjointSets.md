# Disjoint Sets - "Set of Sets"

> Collection of n elements partitioned in disjoint sets. Each element is unique, represented by an integer in [0, n - 1].

- Representative: each set is identified by some memebr of the set, called the _representative_

## Operations

- **makeSet(x):** creation of a new set that contains a single element, x
- **find(x):** returns the set that contains x
- **union(x, y):** mergers sets that contains x and y and returned into a new set (old sets are deleted, we can't have intersections) **YOU HAVE TO RUN A FIND OPERATION BEFORE UNION**

## LinkedList Implementation

> Each set is represented by a LinkedList

- Using a linked list representation of a disjoint sets, a sequence of m "make_set, union and find" operations, **n of which are make_set operations, takes O(m + nlogn).** nlogn comes from the idea that you append the sorter list to the end

## Applications of Disjoint-Set ADT

- Kruskal's algorithm to compute minimum spanning tree
- Maintaining connected components of a graph
- To determine if a graph contains a cycle
- Generation of mazes

## Array Implementation O(m\*n) OR O(m alpha(n)) Linear

```java
public class DisjointSet {
    private int size;
    private int[] list;

    public DisjointSet() {
        size = 10;
        list = new int[size];

        for (int i = 0; i < size; i++) {
            list[i] = -2;
        }
    }

    public DisjointSet(int s) {
        size = s;
        list = new int[size];

        for (int i = 0; i < size; i++) {
            list[i] = -2;
        }
    }

    public void makeSet(int x) {
        list[x] = -1;
    }

    public int find(int x) {
        int element = x;
        while(list[element] != -1) {
            element = list[element]
        }

        return element;
    }

    public void union(int x, int y) { // x and y are ROOTS
        list[y] = x;
    }

    public String toString() {
        String s = "";

        for (int i = 0; i < size; i++) {
            s += list[i] + " ";
        }

        return "[" + s + "]";
    }
}
```
