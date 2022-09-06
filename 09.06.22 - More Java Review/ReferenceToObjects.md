# Java Review - More Java Review

## Arrays

- Arrays are treated like Objects

```java
double[] phoneBills; // declaration
phoneBills = new double[12]; // initialization

// OR all in one like
double[] phoneBills = new double[12];

 // ACCESS Elements
phoneBills[0];

// Get the LENGTH
int length = phoneBills.length; // GET THE LENGTH

// ITERATE through arrays
for (int i = 0; i < length; i++) {
    phoneBill[i]; //...
}
```

## Random Numbers

- **nextInt(n)**: [0, n) _from Random_
- **Math.random()**: [0, 1) _from Math_

### Random.randInt

```java
import java.util.Random;

Random rand = new Random();

// get a random number (0 to 99 inclusive)
int x = rand.nextInt(100)
```

### Math.random

```java
// get a random number (0 to 99 inclusive)
int x = (int)(Math.random() * 100)
```

## ArrayList
