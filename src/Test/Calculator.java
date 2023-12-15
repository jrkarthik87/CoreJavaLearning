package Test;

import java.util.Scanner;

public class Calculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            char choice;

            do {
                System.out.print("Enter the first number: ");
                double num1 = scanner.nextDouble();

                System.out.print("Enter the second number: ");
                double num2 = scanner.nextDouble();

                System.out.print("Enter the operation (+, -, *, /): ");
                char operator = scanner.next().charAt(0);

                double result = 0;

                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            System.out.println("Error: Cannot divide by zero.");
                            return;
                        }
                        break;
                    default:
                        System.out.println("Error: Invalid operator.");
                        return;
                }

                System.out.println("Result: " + result);

                System.out.print("Do you want to perform another calculation? (y/n): ");
                choice = scanner.next().charAt(0);

            } while (choice == 'y' || choice == 'Y');

            System.out.println("Calculator program exited.");
        }
    }

