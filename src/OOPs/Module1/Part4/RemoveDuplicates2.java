package OOPs.Module1.Part4;

import java.util.Arrays;

public class RemoveDuplicates2 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 4, 5, 5};
        int length = arr.length;

        // Check for empty or one-element arrays
        if (length <= 1) {
            System.out.println("Array without duplicates: " + Arrays.toString(arr));
            return;
        }

        // Sort the array to group duplicates together
        Arrays.sort(arr);

        // Initialize variables to keep track of unique elements
        int uniqueCount = 1;

        // Iterate through the sorted array, skipping duplicates
        for (int i = 1; i < length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[uniqueCount] = arr[i];
                uniqueCount++;
            }
        }

        // Create a new array with unique elements
        int[] uniqueArray = Arrays.copyOf(arr, uniqueCount);

        // Print the array without duplicates
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArray));
    }
}

