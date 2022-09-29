# Recursion

## Terminology

- **Directly Recursive:** a method that calls itself
- **Indirectly Recursive:** a method that calls
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

### Iterative

```java
long factorial(int n) {
    Stack<Long> stack = new Stack<Long>();
    stack.push(n)

    while (stack.size()) {
        long current = stack.pop();

        if (n >= 1)
            stack.push(current * (n - 1));
    }
}
```
