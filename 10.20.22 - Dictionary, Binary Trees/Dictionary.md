# Dictonary ADT

## Definition

- **Key:** is a value that uniquely identifies an element

## Methods

- **insert**
- **remove**
- **remove**

## Implementation

Dictionaries can be implemented using any data structure that supports the operations mentioned above:

- LinkedList
- Hashing
- BinaryTrees

## DictionaryInterface

```java
public interface DictionaryInterface {
    public boolean isEmpty();
    public void print();
    public String find(String key);
    public void add(String key, String value)'
    public void remove(String key);
    public void replace(String key, String value);
}
```
