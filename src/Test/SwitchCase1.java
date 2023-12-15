package Test;

import java.util.Scanner;

public class SwitchCase1 {
    public static void main(String[]args){
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = a.nextInt();
        switch(num)
        {
            case 1:
                System.out.println("the number is one");
                break;
            case 2:
                System.out.println("the number is two");
                break;
            case 3:
                System.out.println("the number is three");
                break;
            default:
                System.out.println("not in the list");
        }
    }
}
