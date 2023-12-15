package Test;

import java.util.Scanner;

public class IfElse3 {
    public static void main(String[]args){
        Scanner a = new Scanner(System.in);
        int num;
        System.out.print("The Number is : ");
        num = a.nextInt();
        if(num==1){
            System.out.println("One");
        }
        else if(num==2)
        {
            System.out.println("Two");
        }
        else if(num==3){
            System.out.println("Three");
        }
        else if(num==4){
            System.out.println("Four");
        }
        else if(num==5){
            System.out.println("Five");
        }
        else
        {
            System.out.println("Not in the list");
        }
    }
}
