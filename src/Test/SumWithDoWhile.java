package Test;

import java.util.Scanner;

public class SumWithDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;

        do {
            System.out.print("Enter a number (enter a negative number to stop): ");
            number = scanner.nextInt();

            // Check if the number is positive before adding to the sum
            if (number >= 0) {
                sum += number;
            }

        } while (number >= 0);

        System.out.println("Sum of entered numbers: " + sum);
        System.out.println("Program exited. Goodbye!");

        scanner.close();
    }
}