# Algorithms - Sets

## Mathematical Set Operations

- **Union:** R U S -> add all values in both sets (no duplicates)
- **Intersection:** R n S -> elements present in both sets
- **Difference:** R - S -> all elements in S are taken out of R

## Set Abstract Data Types

> No duplicates

### Methods

- add(e)
- remove(e)
- union(Q, R, S): compute Q = R U S
- intersection (Q, R, S) compute Q = R n S
- difference(Q, R, S) compute Q = R - S

### Approach

- **union R u S:** add S to output set; search each member of R in S before adding to the output; add if not there
- **intersection R n S:** search each member of R in S before adding to output; add if in both
- **difference R - S:** search each member of R in S before adding to output; add if not there

## Boolean Arrays

> With a small domain, you can set an array where the index represent the number and the value (true or false) represents if the number is present

- **search, add, remove in O(1)**
- union Q.list[i] = R.list[i] | S.list[i] -> O(n) **OR**
- union Q.list[i] = R.list[i] & S.list[i] -> O(n) **AND**
- union Q.list[i] = R.list[i] & ~S.list[i] -> O(n) **AND NOT**
