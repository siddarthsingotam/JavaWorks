package OOPs.Module1.Part4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numbers in an array: ");
        int numberAmount = scanner.nextInt();

        // Creating an array
        int[] numberArray = new int[numberAmount];
        int length = numberArray.length;

        // Take user input of numbers
        for (int i = 0; i < numberAmount; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int number = scanner.nextInt();
            numberArray[i] = number;
        }

        // logic to remove duplicates

        int[] newNumberArray = new int[numberAmount];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++){
            boolean isDuplicate = false;

            // checking for duplicates
            for (int j = 0; j < uniqueCount; j++){
                if (numberArray[i] == newNumberArray[j]){
                    isDuplicate = true;
                    break;

                }

            }
            if (!isDuplicate){
                newNumberArray[uniqueCount] = numberArray[i];
                uniqueCount++;
            }
        }
        // Print the resulting array without duplicates
        System.out.println("The array without duplicates:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(newNumberArray[i] + " ");
        }
    }
}
