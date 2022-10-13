# Sorting

## What?

- consist of rearrangeing a collection of objects for which operators such as (== ,<=, >= etc)
- you can sort many types of things: numbers, strings, people

## Why?

- allows for faster algorithms
- allows to solve other problems easier

## Bubble Sort (#4?)

> Bubble up the maximum to the back

- **Worst:** O(n^2)
- **Average:** O(n^2)

- Go through the list and compare the current number to the number in front of it
- Then, swap the values depending which is greater
- By that point, the last element should be the greatest.
- Repeat until you have placed all values at the end

> Only passes through list in smaller and smaller intervals (as you finalize the list, you don't have to go all the way to end)

```java
public void bubbleSort(int[] list) {
    int n = list.length;

    for (int i = 0; i < n - 1; i++)
        for (int j = 0; j < n - i - 1; j++)
            if (list[j] > list[j+1]) {
                // swap values
                int temp = list[j];
                list[j] = list[j + 1];
                list[j + 1] = temp;
            }
}
```

## Quicksort (#1)

> Divide and Conquer Algorithm

- **Worst:** O(n^2)
- **Average:** O(nlogn)

1. Select a pivot (midpoint)
2. Place all values less than the pivot into a list
3. Place all values greater than the pivot into a list
4. Run Quicksort on both bins recursively
5. Eventually, you will try to sort an empty array: base case

## Insertion Sort (#2)

> Insert each element into the correct position

- **Worst Case:** O(n^2)

```java
public void insertionSort(int[] list) {
    for (int i = 1; i < list.length; i++) {
        int current = list[i];

        int prev = i - 1;
        while (prev >= 0 && current < list[prev]) {
            list[prev + 1] = list[prev];
            prev--;
        }

        list[prev + 1] = current;
    }
}
```

## Selection Sort (#3)

> Bring the smallest number to the beginning

- **Worst Case:** O(n^2)

```java
public void selectionSort(int[] list) {
    for (int i = 0; i < list.length - 1; i++) {
        int minPos = minimum(list, i, list.length - 1);
        swap(list, i, minPos);
    }
}
```

### Merging Lists

> Used for Merge Sort. Merges two sorted lists

1. save pointers to the starting elements
2. depending which is greater, you place the element in the merged list
3. advance the pointer of the list that contains the element placed
4. once you get to the end of one of the list, you can place the rest of the elements on the other list at the end of the mergedlist

- NOTE: the mergedList has to be big enough to hold all elements in boths lists

```java
public void merge(int[] list1, int[] list2, int[] mergedList) {
    int p1 = 0;
    int p2 = 0;
    int p3 = 0;

    while (p1 < list1.length && p2 < list2.length) {
        if (list1[p1] < list2[p2])
            mergedList[p3] = list1[p1++];
        else
            mergedList[p3] = list2[p2++];

        p3++;
    }

    // merge the rest of whichever list was not traversed fully
    while (p1 < list1.length)
        mergedList[p3++] = list1[p1++];

    while (p2 < list2.length)
        mergedList[p3++] = list2[p2++];
}
```

### Merge Sort

> Divide and Conquer

- **Worst:** O(nlogn) you are diving the list into smaller and smaller lists (halving)

1. Sort each sublist recursively [start, mid) and [mid, end]
2. merge the sorted sublists

```java
public void mergeSort(int[] list) {
    mergeSortHelper(int[] list, 0, list.length - 1);
}

public void mergeSortHelper(int[] list, int begin, int end) {
    if (begin < end) {
        int mid = start + (end - start) / 2;
    }
}

```
