package Module1.Part3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the start and end integers
        System.out.print("Enter the start integer: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end integer (greater than start): ");
        int end = scanner.nextInt();

        // Validate input
        if (start < 2 || end <= start) {
            System.out.println("Invalid input. Make sure start is greater than or equal to 2 and end is greater than start.");
        } else {
            System.out.println("Prime numbers between " + start + " and " + end + " are:");

            for (int number = start; number <= end; number++) {
                if (isPrime(number)) {
                    System.out.println(number);
                }
            }
        }

        scanner.close();
    }

    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

