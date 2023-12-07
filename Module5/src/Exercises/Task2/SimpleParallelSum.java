package Exercises.Task2;

import java.util.ArrayList;
import java.util.List;


// I did not understand the question properly, but I thought, In the program,
// each thread is responsible for calculating the sum of a portion of consecutive numbers,
// and the main thread combines these partial sums to get the overall sum of the entire range.
public class SimpleParallelSum {

    public static void main(String[] args) {
        // Example input: the range of numbers
        int start = 1;
        int end = 10;

        // Number of threads to use
        int numThreads = 4;

        // Calculate the sum in parallel
        int result = parallelSum(start, end, numThreads);

        System.out.println("The Partial sum is: " + result);
    }

    public static int parallelSum(int start, int end, int numThreads) {
        int chunkSize = (end - start + 1) / numThreads;
        List<SumThread> threads = new ArrayList<>();

        for (int i = 0; i < numThreads; i++) {
            int threadStart = start + i * chunkSize;
            int threadEnd = (i == numThreads - 1) ? end : threadStart + chunkSize - 1;

            SumThread thread = new SumThread(threadStart, threadEnd);
            threads.add(thread);
            thread.start();
        }

        int result = 0;

        try {
            for (SumThread thread : threads) {
                thread.join();
                result += thread.getPartialSum();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return result;
    }

    static class SumThread extends Thread {
        private final int start;
        private final int end;
        private int partialSum;

        SumThread(int start, int end) {
            this.start = start;
            this.end = end;
            this.partialSum = 0;
        }

        @Override
        public void run() {
            for (int i = start; i <= end; i++) {
                partialSum += i;
            }
        }

        public int getPartialSum() {
            return partialSum;
        }
    }
}
