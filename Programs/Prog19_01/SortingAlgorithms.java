import java.util.Random;

public class SortingAlgorithms {
    public static void bubbleSort(int list[]) {
        int n = list.length;

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
    }

    public static void fillArray(int[] list) {
        Random rand = new Random();
        for (int i = 0; i < list.length; i++)
            list[i] = rand.nextInt(100);
    }

    public static void printArray(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }

        System.out.println();
    }
}
