# ArrayList

- we can't use _java.util.ArrayList_

```java
public class ArrayList {
    private static final int SIZE = 10;
    private int[] list = new int[SIZE];
    private int length;

    public ArrayList() {
        this.length = 0;
    }

    public boolean isEmpty() {

    }

    public void insert(int x) {
        if (length == SIZE) {
            System.out.println("Insertion Error");
        }

        list[length] = x;
        length++;
    }

    public void removeAt(int pos) {

    }

    public void print() {
        for (int i = 0; i < SIZE; i++)
            System.out.print(list[i] + " ");
        System.out.println();
    }

}
```
