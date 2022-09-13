# Bag ADT

**Definition:** A bag is an abstraction of a multiset. Locations of items are not relevant.

- Methods involving locations: are not offered as part of the public interface (removeAt, addAt, retrieveAt, etc).

```java
//Bag class – implemented as an array
public class Bag
{
    private static final int CAPACITY = 10;
    private int[] bag = new int[CAPACITY]; //array to store the bag items
    private int length;  //amount of items in the bag

    public Bag() {...}

    // no methods to access at a location or remove at a location
    public boolean isEmpty() {...}
    public void add(int x) {...}
    public void remove(int x) {...}
    public void print() {...}

}

```
