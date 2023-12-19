package Test;

import java.util.Scanner;

public class Secret_Code_DoWhileLoop {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        int num = 2367;

        do {
            System.out.println("Enter the number : ");
            num = b.nextInt();
        }
        while(num!=2367);
        System.out.println("Access Granted. ");
        b.close();

    }
}
