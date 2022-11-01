import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        final int DATASET_SIZE = (int) 2e7;
        final int SAMPLE_SIZE = 600;

        String outputFilename = "output_" + (new Date().getTime()) + ".csv";
        PrintWriter output = null;

        //open output stream
        try {
            output = new PrintWriter(new FileWriter(outputFilename));
        } catch (IOException ex) {
            System.exit(1);
        }

        // fill dataSet with DATASET_SIZE elements in the range [0, DATASET_SIZE]
        int[] dataSet = new int[DATASET_SIZE];
        SearchingAlgorithms.fillArray(dataSet, dataSet.length);

        for (int k = 1; k < SAMPLE_SIZE; k++) {
            // variables needed to time the program
            Date date;
            long startTime, endTime, elapsedTime;

            // fill the data source array with 'k' elements in range [0, 2 * dataSet.length]
            int[] dataSource = new int[k];
            SearchingAlgorithms.fillArray(dataSource, 2 * dataSet.length);

            // linear search performace
            date = new Date();
            startTime = date.getTime();

            for (int i = 0; i < k; i++) {
                SearchingAlgorithms.sequentialSearch(dataSet, dataSource[i]);
            }

            date = new Date();
            endTime = date.getTime();

            elapsedTime = endTime - startTime;
            output.print(k + ", " + (elapsedTime / 1000.0) + ", "); // convert ms -> seconds

            // binary search performance
            int[] sortedDataSet = Arrays.copyOf(dataSet, dataSet.length);

            date = new Date();
            startTime = date.getTime();

            SearchingAlgorithms.quickSort(sortedDataSet); // sort the data once

            for (int i = 0; i < k; i++) {
                SearchingAlgorithms.binarySearch(sortedDataSet, dataSource[i]);
            }

            date = new Date();
            endTime = date.getTime();

            elapsedTime = endTime - startTime;
            output.println(elapsedTime / 1000.0); // convert ms -> seconds

            output.flush();
        }

        //close output stream
        output.close();
    }
}
