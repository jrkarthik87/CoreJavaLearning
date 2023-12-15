package Test;

import java.util.Scanner;

public class IfElse4 {
    public static void main(String[]args){
        Scanner a =new Scanner(System.in);
        int i;
        for(i=1;i<=5;i++)
        {
            int num;
            System.out.print("Enter the number :");
            num=a.nextInt();
            if(num>0){
                System.out.println("The given number is positive");
            }
            else if(num<0)
            {
                System.out.println("The given number is negative");
            }
            else{
                System.out.println("None of the above");
            }
            System.out.print("\n");

        }
        a.close();
    }
}
