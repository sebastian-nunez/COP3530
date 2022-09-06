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
