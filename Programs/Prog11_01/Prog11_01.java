package Programs.Prog11_01;

import java.util.Arrays;
import java.util.Random;

/*
 * Doubles the size of an array filled with random numbers
 */
public class Prog11_01 {
    public static void main(String[] args) {
        final int SIZE = 10;
        int[] a = new int[SIZE];

        // Fill the array with random numbers
        Random rand = new Random();
        for (int i = 0; i < a.length; i++)
            a[i] = rand.nextInt(100); // [0, 99]

        System.out.print("Orginal Array (Length " + a.length + "): ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");

        // Copy and double size
        a = Arrays.copyOf(a, a.length * 2);

        System.out.print("\nNew Array (Length " + a.length + "): ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");

    }
}
