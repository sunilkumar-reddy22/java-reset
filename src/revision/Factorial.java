package revision;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner num  = new Scanner(System.in);
        int k = num.nextInt();
        int count = 1;
        int fact = 1;
        while(count <= k) {
            fact = fact * count;
            count++;
        }
        System.out.println("Fact = " + fact);

    }
}
