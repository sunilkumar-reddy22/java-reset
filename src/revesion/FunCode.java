package revesion;
import java.util.Scanner;
public class FunCode {
    public static void main(String[] args) {
    int result0 = sum();
        System.out.println("Result = " +  result0);
    int result1 = sum();
        System.out.println(result1);
        System.out.println("get back to main");
    }
    static int sum() {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = input.nextInt();
        System.out.println("Enter second number");
        int b = input.nextInt();
        int result = a + b;
     //   System.out.println("sum =  " + sum );
     return result;

    }
}
