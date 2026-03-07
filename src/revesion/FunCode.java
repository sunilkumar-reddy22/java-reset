package revesion;
import java.util.Scanner;
public class FunCode {
    public static void main(String[] args) {
        sum();
        sum();
        System.out.println("get back to main");
    }
    static void sum() {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = input.nextInt();
        System.out.println("Enter second number");
        int b = input.nextInt();
        int sum = a + b;
        System.out.println("sum =  " + sum );

    }
}
