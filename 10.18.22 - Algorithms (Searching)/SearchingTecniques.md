# Searching Tecniques

- **"Sorted"** -> Non-decreasing (allows for duplicates)

## Sequential/Linear Search - O(n)

```java
public boolean linearSearch(ArrayList<Integer> list, int target) {
    for (Integer num : list) {
        if (num == target)
            return true;
    }

    return false;
}
```

## Sorted Search - O(n)

> NOTE: Data must be sorted

```java
public boolean sortedSearch(ArrayList<Integer> list, int target) {
    for (Integer num : list) { // list must be SORTED
        if (num == target)
            return true;
        else if (num > target) // early exit
            return false
    }

    return false;
}
```

## Binary Search - O(log(n))

> NOTE: Data must be sorted

```java
public boolean binarySearch(ArrayList<Integer> list, int target) {
    int lower = 0;
    int upper = list.size() - 1;

    while (lower <= upper) {
        int mid = lower + (upper - lower) / 2;

        if (target == list.get(mid)) {
            return true;
        } else if (target > list.get(mid)) {
            lower = mid + 1;
        } else {
            upper = mid - 1;
        }
    }

    return false;
}
```
