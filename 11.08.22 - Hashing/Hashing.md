# Hashing Mechanism

> Dictionaries can use Hashing. (key, value) pairs -> generate keys using a hashing functions

## ArrayLists

```java
public boolean search(String x)
// - linear search

public void add(String x)
// - add x at the end
// - make room at some position

public void remove(String x)
// - shift elements
// - overwrite x with last element
```

## Hashing

**Definition:** technique for insertion, deletions and searches in **average constant time O(1)**

- Data is organized with the help of a _table_, the **hash table**, stored in an array
- Searching a key 'X' is done by applying a function, **'h'** to **'X'**. 'h' is called the **hash function**
- h(X) gives you the position of the element in the hash table

```java
public boolean search(String x) { // O(1) access time
    int hashValue = hash(x);
    return table[hashValue].equals(x);
}
```

### Shortcomings

> Difficult to guarantee that the hashing function will give you a unique key

- **Key Collision:** when two inputs values map to the same hashValue or key

### Hashing Function

> There're different hashing functions to different types of data

- choose a hash function that is **easy to compute**
- **minimize** the number of collisions
- Use % to get a number within the range of the hashtable

```java
// Horne's Method to evaluate polynomials
public int hash(String key, int tableSize) {
    int hashVal = 0;

    for (int i = 0; i < key.length(); i++) {
        hashVal = 37 * hashVal + key.charAt(i);
    }

    hashVal %= tableSize; // forced the hashVal to be within the table
    if (hashVal < 0)
        hashVal += tableSize;

    return hashVal;
}
```

## Collision Resolution

- Chaining (open hashing)
- Open addressing (closed hashing)
  - linear probing
  - quadratic probing
  - random probing

### Chaining

- Whenever you encountered a collision, add it to a LinkedList

### Linear Probing

- elements are stored directly on the array (not keys)
- **Two arrays**: 1 to store the actual values and 1 to store the status of the location
- **To search:** get the hashValue, if the element in the locationStatus is 1 then you found. If the value is 1, keep looking linearly until you find an empty spot (0 in the table), the value itself [1 in the table not -1] (the value would of gone at the open spot)

**Note:** -1 on the status means you removed the element, could be somewhere else

#### Downfall of Linear Probing

- Primary Clustering -> leads to linear time

#### Solutions

- **Quadratic Probing:** h(key) + i ^ 2, i = 0, 1, 2, 4, 8...
- **Random Probing:** h(key) + r(i), r: sequence of random numbers
- **Double Hashing**: h1(key) + i \*h2(key), use 2 hash functions

> Note: resize and rehash the HashTable if the table is 70% full (load factor = 0.7)
