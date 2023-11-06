package OOPs.Module1.Part4;

import java.util.Scanner;

public class Task2N {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of integers in the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Prompt the user to enter the integers into the array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Find the maximum sum subarray
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int startIndex = 0;
        int endIndex = 0;
        int currentStart = 0;

        for (int i = 0; i < n; i++) {
            currentSum += arr[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
                startIndex = currentStart;
                endIndex = i;
            }

            if (currentSum < 0) {
                currentSum = 0;
                currentStart = i + 1;
            }
        }

        // Print the maximum sum and corresponding indices
        System.out.println("Maximum sum: " + maxSum);
        System.out.println("Integers: " + (startIndex + 1) + "-" + (endIndex + 1));
    }
}
