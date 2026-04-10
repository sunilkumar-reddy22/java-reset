package revision;
import java.util.Scanner;
public class Mathpytho {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first num:");
        int a = in.nextInt();
        System.out.println("Enter second num: ");
        int b = in.nextInt();
        System.out.println("Enter third num: ");
        int c = in.nextInt();
        istriplet(a,b,c);
    }
    static void istriplet(int a,int b,int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
         if (c > max) {
            max = c;
        }
        int y = 0;
        if (max == a) {
            y = b * b + c * c;
        }
         if (max == b) {
            y = a * a + c * c;
        } else {
            y = b * b + a * a;
        }
        int ans = max * max;
        if (y == ans) {
            System.out.println("Is Triplet");
        } else {
            System.out.println("not a triplet");

        }

    }

}
