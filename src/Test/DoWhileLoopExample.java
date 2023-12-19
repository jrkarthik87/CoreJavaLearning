package Test;

import java.util.Scanner;

public class DoWhileLoopExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a number (enter 0 to exit): ");
            number = scanner.nextInt();

            // Your logic or processing for each iteration goes here
            System.out.println("You entered: " + number);

        } while (number != 0);

        System.out.println("Program exited. Goodbye!");
        scanner.close();
    }
}