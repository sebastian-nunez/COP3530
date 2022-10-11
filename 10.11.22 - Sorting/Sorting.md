# Sorting

## What?

- consist of rearrangeing a collection of objects for which operators such as (== ,<=, >= etc)
- you can sort many types of things: numbers, strings, people

## Why?

- allows for faster algorithms

## Bubble Sort

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

## Quicksort (1)

> Divide and Conquer Algorithm

- **Worst:** O(n^2)
- **Average:** O(nlogn)

1. Select a pivot (midpoint)
2. Place all values less than the pivot into a list
3. Place all values greater than the pivot into a list
4. Run Quicksort on both bins recursively
5. Eventually, you will try to sort an empty array: base case

## Insertion Sort (2)

> Insert each element into the correct position

- **Worst Case:** O(n^2)
