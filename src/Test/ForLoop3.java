package Test;

import java.util.Scanner;

public class ForLoop3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long result = 0;
        int limit,i;
        System.out.print("Enter the limit of numbers : ");
        limit = scanner.nextInt();

        for(i=1;i<=limit;i++){
            int num;
            System.out.print("Enter the number : ");
            num = scanner.nextInt();

            result += num;

        }

        System.out.println("Sum of total numbers = "+result);
        scanner.close();
    }
}


