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
    }
}
