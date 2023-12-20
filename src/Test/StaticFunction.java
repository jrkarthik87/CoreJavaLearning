package Test;

public class StaticFunction {
    static void Test(int a,int b){
        int sum = a+b;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Test(3,5);
    }
}
