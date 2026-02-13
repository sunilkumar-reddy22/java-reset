package revesion;
import java.util.Scanner;

public class FabiNum1 {
    public static void main(String[] args) {
        System.out.println("input a integer: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int n1 = 0;
        int n2 = 1;
        for (int i = 2; i <= num; i++) {
            int temp = n2;
            n2 = n1 + n2;
            n1 = temp;
        }
        System.out.println("\nFibonacci term at postion " + num + " = "  + n2);
        System.out.println("\nFibonacci series: ");;
        int a = 0;
        int b = 1;
        System.out.println(a+ " " +b);
        for (int k = 3; k <= num; k++) {
            int temp1 = a + b;
            System.out.print(temp1 + " ");
            a = b;
            b = temp1;
        }
        System.out.println("\nFactorial");
        long count = 1;
        long fact = 1;
        while (count <= num) {
            fact = count * fact;
            count++;
        }
        System.out.println("fact = " + fact);

    }
}
