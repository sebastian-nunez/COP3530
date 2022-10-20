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

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int current = list[i];

            int prev = i - 1;
            while (prev >= 0 && current < list[prev]) {
                list[prev + 1] = list[prev];
                prev--;
            }

            list[prev + 1] = current;
        }
    }

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int minPos = minimum(list, i, list.length - 1);
            // swap(list, i, minPos);
        }
    }

    /* Return the index of the smaller element
     */
    private static int minimum(int[] list, int pos1, int pos2) {
        return 0;
    }

    public static void merge(int[] list1, int[] list2, int[] mergedList) {
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        while (p1 < list1.length && p2 < list2.length) {
            if (list1[p1] < list2[p2])
                mergedList[p3] = list1[p1++];
            else
                mergedList[p3] = list2[p2++];

            p3++;
        }

        // merge the rest of whichever list was not traversed fully
        while (p1 < list1.length)
            mergedList[p3++] = list1[p1++];

        while (p2 < list2.length)
            mergedList[p3++] = list2[p2++];
    }

    public static boolean binarySearch(int[] list, int target) {
        int lower = 0;
        int upper = list.length - 1;

        while (lower <= upper) {
            int mid = lower + (upper - lower) / 2;

            if (target == list[mid]) {
                return true;
            } else if (target > list[mid]) {
                lower = mid + 1;
            } else {
                upper = mid - 1;
            }
        }

        return false;
    }

    public static boolean linearSearch(int[] list, int target) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == target)
                return true;
        }

        return false;
    }

    /**
     * Determines if <code>subset</code> is a subset of the UNORDERED <code>superset</code>
     * @param superset
     * @param subset
     * @return
     */
    public static boolean unsortedContaiment(int[] superset, int[] subset) {
        for (int i = 0; i < subset.length; i++) {
            if (!SortingAlgorithms.linearSearch(superset, subset[i])) {
                return false;
            }
        }

        return true;
    }

    /**
    * Determines if <code>subset</code> is a subset of the <code>sortedSuperset</code>
    * @param sortedSuperset
    * @param subset
    * @return
    */
    public static boolean sortedContaiment(int[] sortedSuperset, int[] subset) {
        for (int i = 0; i < subset.length; i++) {
            if (!SortingAlgorithms.binarySearch(sortedSuperset, subset[i])) {
                return false;
            }
        }

        return true;
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
