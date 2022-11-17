import java.util.Random;

public class Prog24_01 {
    public final int ARR_SIZE = 10;

    public static void main(String[] args) {
        new Prog24_01();
    }

    public Prog24_01() {
        Random rand = new Random();
        int[] arr = new int[ARR_SIZE];
        int[] sortedArr = new int[ARR_SIZE];

        for (int i = 0; i < arr.length; i++)
            arr[i] = rand.nextInt() % 10;

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.println();

        heapsort(arr, sortedArr);
        for (int i = 0; i < sortedArr.length; i++)
            System.out.print(sortedArr[i] + " ");
    }

    public void heapsort(int[] arr, int[] sortedArr) {
        Heap heap = new Heap();

        for (int i = 0; i < arr.length; i++)
            heap.add(arr[i]);

        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = heap.min();
            heap.removeMin();
        }
    }
}
