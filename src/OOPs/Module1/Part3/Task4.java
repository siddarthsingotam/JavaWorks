package OOPs.Module1.Part3;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;

        while (score < 10) {
            System.out.println("New Set of Problems:");
            for (int i = 0; i < 10; i++) {
                int num1 = random.nextInt(10) + 1; // Random number between 1 and 10
                int num2 = random.nextInt(10) + 1;
                int correctAnswer = num1 * num2;

                System.out.print("Question " + (i + 1) + ": What is " + num1 + " * " + num2 + "? ");
                int userAnswer = scanner.nextInt();

                if (userAnswer == correctAnswer) {
                    System.out.println("Correct!\n");
                    score++;
                } else {
                    System.out.println("Incorrect. The correct answer is " + correctAnswer + "\n");
                }
            }

            if (score == 10) {
                System.out.println("Congratulations! You've mastered the multiplication tables.");
            } else {
                System.out.println("You scored " + score + " out of 10. Let's try another set of problems.\n");
                score = 0; // Reset the score for a new set of problems
            }
        }

        scanner.close();
    }
}

