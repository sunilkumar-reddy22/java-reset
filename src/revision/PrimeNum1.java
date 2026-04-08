package revision;
import java.util.Scanner;
public class PrimeNum1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = in.nextInt();
        boolean  result =  isPrime(n);
        System.out.println("Result is " + result);

     //   System.out.println("Result = " + isPrime);
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
           // return true;
        }
        return true;
    }
}
