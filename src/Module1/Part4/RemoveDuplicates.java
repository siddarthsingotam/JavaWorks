package Module1.Part4;

import java.util.HashSet;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 4, 5, 5};

        // Convert the array to a HashSet to remove duplicates
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        // Convert the HashSet back to an array
        int[] uniqueArray = new int[set.size()];
        int index = 0;
        for (int num : set) {
            uniqueArray[index++] = num;
        }

        // Print the array without duplicates
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArray));
    }
}
