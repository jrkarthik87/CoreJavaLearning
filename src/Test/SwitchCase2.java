package Test;

import java.util.Scanner;

public class SwitchCase2 {
    public static void main(String[]args){
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        double num1 = a.nextDouble();
        System.out.print("Enter the second number : ");
        double num2 = a.nextDouble();
        System.out.print("Enter the Symbol : ");
        char m;
        m=a.next().charAt(0);
        switch(m)
        {
            case '+':
                System.out.println("the result is "+(num1+num2));
                break;
            case '-':
                System.out.println("the result is "+(num1-num2));
                break;
            case '*':
                System.out.println("the result is "+(num1*num2));
                break;
            case '/':
                System.out.println("the result is "+(num1/num2));
                break;
            case '%':
                System.out.println("the result is "+(num1%num2));
                break;
            default:
                System.out.println("Invalid Symbol");
        }
    }
}
