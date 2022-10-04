import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Prog18_01 {
    public static void main(String[] args) {
        new Prog18_01();
    }

    public Prog18_01() {
        int[] a = new int[100000000];

        Random rand = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt();
        }

        Date current = new Date();
        long start = current.getTime();

        int min = minimum(a, a.length);

        current = new Date();
        long stop = current.getTime();

        System.out.println("\nMin= " + min + ", time=" + (stop - start));

        current = new Date();
        start = current.getTime();

        min = minimum(a);

        current = new Date();
        stop = current.getTime();

        System.out.println("\nMin= " + min + ", time=" + (stop - start));
    }

    public long timeIt()

    public int minimum(int[] array) {
        Arrays.sort(array);
        return array[0];
    }

    public int minimum(int[] array, int n) {
        int min = array[0];

        for (int i = 1; i < n; i++) {
            if (array[i] < min)
                min = array[i];
        }

        return min;
    }
}
