import java.util.Arrays;

public class Prog19_01 {
    public static void main(String[] args) {
        int[] list1 = new int[10];
        SortingAlgorithms.fillArray(list1);
        int[] list2 = Arrays.copyOf(list1, list1.length);
        SortingAlgorithms.printArray(list1);

        System.out.println("Bubble Sort: ");
        SortingAlgorithms.bubbleSort(list1);
        SortingAlgorithms.printArray(list1);

        System.out.println();

        System.out.println("Insertion Sort: ");
        SortingAlgorithms.insertionSort(list2);
        SortingAlgorithms.printArray(list2);

        System.out.println();
        System.out.println("MergedList: ");
        int[] l1 = { 1, 2, 3, 4, 5 };
        int[] l2 = { 6, 7, 8 };
        int[] mergedList = new int[l1.length + l2.length];
        SortingAlgorithms.merge(l1, l2, mergedList);
        SortingAlgorithms.printArray(mergedList);

        System.out.println();
        int[] sortedList = { 1, 3, 4, 4, 4, 12, 17, 29, 30 };
        System.out.println("Sorted list: ");
        SortingAlgorithms.printArray(sortedList);
        long start = System.nanoTime();
        SortingAlgorithms.binarySearch(sortedList, 12);
        long elapsed = System.nanoTime() - start;
        System.out.printf("%.4f ms\n", elapsed * 1e-6);
        System.out.println("Was 99 found? " + SortingAlgorithms.binarySearch(sortedList, 99));

        System.out.println();
        int[] superset = { 1, 5, 3, 4, 8, 6 };
        int[] subset = { 3, 4 };
        int[] subset2 = { 99, 1, 45 };

        System.out.println(
                "Is { 3, 4 } a subset of { 1, 5, 3, 4, 8, 6 }: "
                        + SortingAlgorithms.unsortedContaiment(superset, subset));

        System.out.println(
                "Is { 99, 1, 45} a subset of { 1, 5, 3, 4, 8, 6 }: "
                        + SortingAlgorithms.unsortedContaiment(superset, subset2));
    }
}
