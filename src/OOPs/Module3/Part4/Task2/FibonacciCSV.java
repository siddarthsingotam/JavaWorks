package OOPs.Module3.Part4.Task2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FibonacciCSV {
    private static final String CSV_FILE_PATH = "path to the CSV file to be written here:) ";

    public static void main(String[] args) {
        List<Long> fibonacciSequence = generateFibonacci(100);

        try (FileWriter writer = new FileWriter(CSV_FILE_PATH)) {
            // Write the header
            writer.append("Index,Fibonacci Number\n");

            // Write the Fibonacci sequence to the CSV file
            for (int i = 0; i < fibonacciSequence.size(); i++) {
                writer.append(i + 1 + "," + fibonacciSequence.get(i) + "\n");
            }

            System.out.println("Fibonacci sequence has been written to " + CSV_FILE_PATH);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Long> generateFibonacci(int n) {
        List<Long> fibonacciSequence = new ArrayList<>();
        long a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            fibonacciSequence.add(a);
            long next = a + b;
            a = b;
            b = next;
        }

        return fibonacciSequence;
    }
}



