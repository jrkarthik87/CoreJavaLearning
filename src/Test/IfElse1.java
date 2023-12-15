package Test;

import java.util.Scanner;

public class IfElse1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = s.nextInt();
        if (num > 0) {
            System.out.println("Positive number");
        } else if (num < 0) {
            System.out.println("Negative Number");
        } else {
            System.out.println("Zero");
        }
        s.close();
    }
}
