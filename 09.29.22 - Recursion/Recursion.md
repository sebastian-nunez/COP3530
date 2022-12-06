# Recursion

## Terminology

- **Directly Recursive:** a method that calls itself
- **Indirectly Recursive:** a method that calls a recursive method (helper)
- **Tail Recursive:** recursive method in which the last statement executed is the recursive call
- **Infinite Recursion:** the case where each recursive call results in another recursive call

## Factorial

### Recursive

```java
// recursive implementation
long factorial(int n) {
    if (n == 1) // base case
        return 1;

    return n * factorial(n - 1); // recursive calls
}
```

## Recursion 2

## Method that writes a given array backwards

- print the last element
- print the last element recursively
- stop when the size is zero

### Normal

```java
public void printReverseArray(String[] input) {
    printReverseArrayHelper(input, input.length - 1);
}

public void printReverseArrayHelper(String[] input, int lastPos) {
    if (lastPos < 0) {
        System.out.println();
        return;
    }

    String last = input[lastPos];

    System.out.print(last + " ");
    printReverseArrayHelper(input, lastPos - 1);
}
```

### Tail Recursion

```java
public void printReverseArray2(String[] input) {
    printReverseArrayHelper2(input, 0);
}

public void printReverseArrayHelper2(String[] input, int pos) {
    if (pos == input.length) {
        return;
    }

    printReverseArrayHelper2(input, pos + 1);

    String last = input[pos];
    System.out.print(last + " ");
}
```

## Count Items in LinkedList

```java
public int count() {
    return countItems(this.head.next); // count from head
}

public int countItems(Node node) {
    if (node == null)
        return 0;

    return 1 + countItems(node.next);
}
```
