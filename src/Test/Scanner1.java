package Test;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[]args){

        Scanner obj=new Scanner(System.in);
        int num1,num2,result;
        System.out.print("Enter the first num1 :");
        num1=obj.nextInt();
        System.out.print("Enter the last num2 :");
        num2=obj.nextInt();
        result=num1*num2;
        result/=num1;
        System.out.println("The total result is "+result);
        obj.close();

    }
}
