package OOPs.Module1.Part4;

import java.util.Scanner;

public class LoopingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many integers? ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the integers:");

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("The integers in reverse order:");

        for (int i = size - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}

