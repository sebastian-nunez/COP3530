# Random Number Generation

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

## Random Numbers using _java.util.Random_

```java
import java.util.Random;

public class Prog08_02 {
    public static void main(String[] args) {
        final int SIZE = 10;
        int[] a = new int[SIZE];

        // Fill the array with random numbers
        Random rand = new Random();
        for (int i = 0; i < SIZE; i++)
            a[i] = rand.nextInt(100); // [0, 99]

        // print all the numbers
        for (int i = 0; i < SIZE; i++)
            System.out.print(a[i] + " ");

        System.out.println();

        //  Min, Max, and Average
        int sum = 0;
        int min = a[0];
        int max = a[0];
        double avg = 0;

        for (int i = 0; i < SIZE; i++) {
            sum += a[i];

            if (a[i] < min)
                min = a[i];

            if (a[i] > max)
                max = a[i];
        }

        avg = sum / SIZE;

        System.out.println("\nmin: " + min + ", avg: " + avg + ", max: " + max);

    }
}
```
