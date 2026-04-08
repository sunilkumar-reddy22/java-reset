package revision;
import java.util.Scanner;
public class PythageroanTriples {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.println("First Number: ");
        int a = in.nextInt();
        System.out.println("Second Number: ");
        int b = in.nextInt();
        System.out.println("Third Number: ");
        int c =  in.nextInt();
       if(isprime(a,b,c)) {
           System.out.println("Is Prime");
       }
       else {
           System.out.println("Is not prime");
       }
    }
    static boolean isprime(int a,int b,int c) {
        int max = Math.max(a, Math.max(b,c));
        if(max == a) {
           return a * a == b * b + c * c;
        }
        else if(max == b) {
            return b * b == c * c + a * a;
        }
        else {
            return c * c == a * a + b * b;
        }
    }
}
