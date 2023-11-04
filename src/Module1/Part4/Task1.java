package Module1.Part4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int nameInstance;
        String firstName, lastName;
        char[] firstArray, lastArray;

        // User input
        System.out.print("Enter first name: ");
        firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        lastName = scanner.nextLine();

        System.out.print("How many names?: ");
        nameInstance = scanner.nextInt();


        for (int a = 0; a < nameInstance; a++) {
            // Generating a random number for first name and last name index

            // Converting User Input into array
            firstArray = new char[firstName.length()]; // Taking length of the firstname string.
            for (int i = 0; i < firstName.length(); i++) {
                int firstRandom = random.nextInt(firstName.length());
                firstArray[i] = firstName.charAt(firstRandom);
            }

            lastArray = new char[lastName.length()]; // Taking length of the string.
            for (int i = 0; i < lastName.length(); i++) {
                int lastRandom = random.nextInt(lastName.length());
                lastArray[i] = lastName.charAt(lastRandom);
            }

            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();

            for (char c : firstArray) {
                sb1.append(c);
            }

            for (char c : lastArray) {
                sb2.append(c);
            }

            // Formatting strings
            String firstArrayAsString = sb1.toString();
            String firstSub1 = firstArrayAsString.substring(0, 1).toUpperCase();
            String firstSub2 = firstArrayAsString.substring(1).toLowerCase();
            String res1 = firstSub1 + firstSub2;

            String lastArrayAsString = sb2.toString();
            String lastSub1 = lastArrayAsString.substring(0, 1).toUpperCase();
            String lastSub2 = lastArrayAsString.substring(1).toLowerCase();
            String res2 = lastSub1 + lastSub2;


            System.out.println("Name " + (a+1) +": " + res1 + " " + res2);
        }


    }
}
