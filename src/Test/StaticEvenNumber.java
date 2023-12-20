package Test;

public class StaticEvenNumber {
    static void Test(int num){
        if (num%2==0){
            System.out.println("The given number is even");
        }
        else{
            System.out.println("The given number is odd");
        }
    }
    public static void main(String[] args) {
        Test(5);
    }
}
