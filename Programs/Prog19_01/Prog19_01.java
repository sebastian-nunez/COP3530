public class Prog19_01 {
    public static void main(String[] args) {
        int[] list = new int[4];
        SortingAlgorithms.fillArray(list);
        SortingAlgorithms.printArray(list);

        SortingAlgorithms.bubbleSort(list);
        SortingAlgorithms.printArray(list);
    }
}
