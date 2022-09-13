# ArrayList

- we can't use _java.util.ArrayList_

## Complexity

- **Direct Access:** O(1)
- **Removal:** O(n)
  - if order doesn't matter: O(1)

```java
public class ArrayList {
    private static final int CAPACITY = 10; // capacity
    private int[] list = new int[CAPACITY];
    private int length;

    public ArrayList() {
        this.length = 0; // pointer to first available spot (0-indexed)
    }

    public boolean isEmpty() {
        return length == 0;
    }

    // insert element at index 'pos' O(1)
    public void insert(int pos) {
        if (length == CAPACITY) {
            System.out.println("Insertion Error: list is full");
        }

        list[length] = pos;
        length++;
    }

    // remove element at index 'pos' O(n)
    public void remove(int pos) {
        for (int i = pos; i < length - 1; i++)
            list[i] = list[i + 1];

        length--;
    }

    public void print() {
        for (int i = 0; i < CAPACITY; i++)
            System.out.print(list[i] + " ");
        System.out.println();
    }

}
```
