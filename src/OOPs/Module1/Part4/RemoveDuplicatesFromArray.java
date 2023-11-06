package OOPs.Module1.Part4;

import java.util.Scanner;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] originalArray = new int[size];

        System.out.println("Enter the integers into the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            originalArray[i] = scanner.nextInt();
        }

        int[] uniqueArray = new int[size];
        int uniqueCount = 0;

        // Iterate through the original array and keep only the first occurrence of each number
        for (int i = 0; i < size; i++) {
            boolean isDuplicate = false;

            // Check if the current number is already in the uniqueArray
            for (int j = 0; j < uniqueCount; j++) {
                if (originalArray[i] == uniqueArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If it's not a duplicate, add it to the uniqueArray
            if (!isDuplicate) {
                uniqueArray[uniqueCount] = originalArray[i];
                uniqueCount++;
            }
        }

        // Print the resulting array without duplicates
        System.out.println("The array without duplicates:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(uniqueArray[i] + " ");
        }
    }
}

