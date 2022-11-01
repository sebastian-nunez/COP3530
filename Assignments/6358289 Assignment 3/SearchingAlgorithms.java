import java.util.Random;

/**
 * Sebastian Nunez (6358289)
 * COP3530
 * Assignment 3
 */
public class SearchingAlgorithms {
    /**
     * Runs a iterative binary search operation for a specified value in the search space.
     * Note: search space must be sorted in asending order!
     * @param list search space
     * @param x target element
     * @return target was found in the search space
     * @author Sebastian Nunez
     */
    public static boolean binarySearch(int[] list, int x) {
        int lower = 0;
        int upper = list.length - 1;

        while (lower <= upper) {
            int pivot = findPivotLocation(lower, upper);

            if (list[pivot] == x) {
                return true;
            } else if (x < list[pivot]) {
                upper = pivot - 1;
            } else {
                lower = pivot + 1;
            }
        }

        return false;
    }

    /**
     * Runs a ilinear search operation for a specified value in the search space.
     * @param list search space
     * @param x target element
     * @return target was found in the search space
     * @author Sebastian Nunez
     */
    public static boolean sequentialSearch(int[] list, int x) {
        for (int i = 0; i < list.length; i++)
            if (list[i] == x)
                return true;

        return false;
    }

    /**
    * Recursive quickSort algorithm
    * @author Prof. A. Hernandez
    */
    public static void quickSort(int[] list) {
        quicksort(list, 0, list.length - 1);
    }

    private static void quicksort(int[] list, int begin, int end) {
        int temp;
        int pivot = findPivotLocation(begin, end);
        // swap list[pivot] and list[end]
        temp = list[pivot];
        list[pivot] = list[end];
        list[end] = temp;
        pivot = end;
        int i = begin,
                j = end - 1;
        boolean iterationCompleted = false;
        while (!iterationCompleted) {
            while (list[i] < list[pivot])
                i++;
            while ((j >= 0) && (list[pivot] < list[j]))
                j--;
            if (i < j) {
                //swap list[i] and list[j]
                temp = list[i];
                list[i] = list[j];
                list[j] = temp;
                i++;
                j--;
            } else
                iterationCompleted = true;
        }
        //swap list[i] and list[pivot]
        temp = list[i];
        list[i] = list[pivot];
        list[pivot] = temp;
        if (begin < i - 1)
            quicksort(list, begin, i - 1);
        if (i + 1 < end)
            quicksort(list, i + 1, end);
    }

    /*
    * Computes the pivot
    */
    private static int findPivotLocation(int b, int e) {
        return (b + e) / 2;
    }

    /**
     * Fills an given array with random numbers from 0 to range (inclusive)
     * @param list reference to the list to be filled.
     * @param range specifies the allowed range of values (inclusive)
     * @author Sebastian Nunez
     */
    public static void fillArray(int[] list, int range) {
        Random rand = new Random();
        for (int i = 0; i < list.length; i++)
            list[i] = rand.nextInt(range + 1); // add 1 to make it inclusive of the upper bound
    }

    /**
     * Prints a visual representation of a given lists to the console.
     * @param list reference to the list to be printed
     * @author Sebastian Nunez
     */
    public static void printArray(int[] list) {
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();
    }
}
