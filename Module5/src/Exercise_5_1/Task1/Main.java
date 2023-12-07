package Exercise_5_1.Task1;

import java.util.Scanner;

class PrintEvenNumbers implements Runnable{
    int rangeEven;
    public PrintEvenNumbers(int numberRange){
        this.rangeEven = numberRange;
    }
    @Override
    public void run() {
        for(int i = 0; i <= rangeEven; i++){
            if(i % 2 == 0){
                System.out.println("Even thread: "+ i);
                try {
                    Thread.sleep(1000); // Also added a delay of 1 second to test thread functionality
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

class PrintOddNumbers implements Runnable{
    int rangeOdd;
    public PrintOddNumbers(int rangeOdd){
        this.rangeOdd = rangeOdd;
    }
    @Override
    public void run() {
        for(int i = 0; i <= this.rangeOdd; i++){
            if(i % 2 != 0){
                System.out.println("Odd thread: "+ i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the range of numbers: ");

        int numberRange = scanner.nextInt();
        PrintEvenNumbers printEvenNumbers = new PrintEvenNumbers(numberRange);
        PrintOddNumbers printOddNumbers = new PrintOddNumbers(numberRange);

        Thread evenThread = new Thread(printEvenNumbers);
        Thread oddThread = new Thread(printOddNumbers);

        evenThread.start();
        oddThread.start();

    }

}
