package Module1.Part4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArray;

        System.out.println("Enter the numbers in array: ");
        int numbersItems = scanner.nextInt();
        numbersArray = new int[numbersItems];

        System.out.println("Enter the all the " + numbersItems + " numbers");

        for (int i =0; i < numbersItems; i++){
            System.out.print("Enter number " + (i + 1) + ": ");
            int number = scanner.nextInt();
            numbersArray[i] = number;
        }

        // Sort the array in descending order
        int[] numbersArraySorted = numbersArray;
        Arrays.sort(numbersArraySorted);
        Collections.reverse(Arrays.asList(numbersArraySorted));

        // System.out.println(numbersArray[numbersArray.length - 1]);

        //Add the two maximum values
        int maxSum = numbersArraySorted[numbersArraySorted.length - 1] + numbersArray[numbersArraySorted.length - 2];

        System.out.println(maxSum);




    }
}
