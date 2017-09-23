import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int test=new Scanner(System.in).nextInt();
        System.out.println(fibonacci(test));
    }

    private static int fibonacci(int test) {
        if(test==1){
            return 1;
        }
        return fibonacci(test-1)* test;
    }
}
