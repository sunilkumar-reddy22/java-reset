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
        System.out.println(n2);
        System.out.println("\nseries");
        int num2 = input.nextInt();
        int a = 0;
        int b = 1;
        for (int k = 2; k <= num2; k++) {
            int temp1 = a + b;
            System.out.print(temp1 + " ");
            a = b;
            b = temp1;
        }
        System.out.println("\nFactorial");
        int terms = input.nextInt();
        long count = 1;
        long fact = 1;
        while (count <= terms) {
            fact = count * fact;
            count++;
        }
        System.out.println("fact = " + fact);

    }
}
