package Test;

public class StaticFunctionAddNumbers {
    static int AddNumbers(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        int result = AddNumbers(3,5);
        System.out.println("Total Sum is: " + result);

    }
}
