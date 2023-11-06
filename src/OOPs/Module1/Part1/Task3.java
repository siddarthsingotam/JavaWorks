package OOPs.Module1.Part1;

import java.util.Scanner;

// Variables type should be float to include the decimal value in the average. Integer won't give us decimal approximations
public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        float first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        float second = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");
        float third = Integer.parseInt(scanner.nextLine());

        System.out.println("The sum of the numbers is " + (first + second + third));
        System.out.println("The product of the numbers is " + (first * second * third));
        System.out.println("The avg of the numbers is " + (first + second + third)/3);
    }
}

