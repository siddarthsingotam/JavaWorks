package OOPs.Module1.Part3;

import java.util.Scanner;
public class TestForLoop {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        // System.out.println("The number is: " + num);
        // Other way of writing the string is also possible like this
        System.out.printf("The number is: %d\n", num);

        // testing the for loop
        System.out.println("\nTesting For loop");

        int i;
        for (i = 0; i < 5; i++){
            System.out.printf("The number %d is: %d\n", i+1, num);
            num += 2;
        }



    }
}
