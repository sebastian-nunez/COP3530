# Disjoint Sets - "Set of Sets"

> Collection of n elements partitioned in disjoint sets. Each element is unique, represented by an integer in [0, n - 1].

- Representative: each set is identified by some memebr of the set, called the _representative_

## Operations

- **makeSet(x):** creation of a new set that contains a single element, x
- **find(x):** returns the set that contains x
- **union(x, y):** mergers sets that contains x and y and returned into a new set (old sets are deleted, we can't have intersections)

## LinkedList Implementation

> Each set is represented by a LinkedList

- Using a linked list representation of a disjoint sets, a sequence of m "make_set, union and find" operations, **n of which are make_set operations, takes O(m + nlogn).** nlogn comes from the idea that you append the sorter list to the end

## Array Implementation
