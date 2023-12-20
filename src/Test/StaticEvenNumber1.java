package Test;

import java.util.Scanner;

public class StaticEvenNumber1 {
    static void Test(int num){
        if(num%2==0){
            System.out.println("The given number is even number");
        }
        else{
            System.out.println("The given number is odd number");
        }
    }
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = f.nextInt();
        Test(a);
        f.close();
    }
}
