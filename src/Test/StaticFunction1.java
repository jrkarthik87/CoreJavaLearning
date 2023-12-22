package Test;

import java.util.Scanner;

public class StaticFunction1 {
    static void divisible(int num){
        if(num%4==0){
            System.out.println("The number is divisible by four");
        }
        else{
            System.out.println("The number is not divisible by four");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please Enter the number : ");
        int a = s.nextInt();
        divisible(a);
        s.close();

    }
}
