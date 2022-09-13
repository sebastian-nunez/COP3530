# Expandable Arrays

- You can't expand the CAPACITY of an arrays!

## Steps

1. Make a **new** Array of double the size of the first
2. **Copy all elements** from the _original_ array into the _new_ array
3. **Point** the original array into the new array _(shallow copy)_

### Copying Arrays

- System.arraycopy(newArray, start, array, end, SIZE);

- Arrays.copyOf(array, SIZE); **-> returns a newArray**
  - array: array that will be copied
  - SIZE: capacity of the new array
