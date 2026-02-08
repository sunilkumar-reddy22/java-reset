package revesion;
import java.util.Scanner;
public class ReviseFact {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        long num = input.nextInt();
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Fact = " + fact);
    }

}

