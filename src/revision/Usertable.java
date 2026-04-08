package revision;
import java.util.Scanner;
public class Usertable {
    public static void main(String[] args) {
        System.out.println("enter an integer: ");
        Scanner input = new Scanner (System.in);
        int k = input.nextInt();
        for(int j = 1; j <= 10;  j++) {
            System.out.println(k + " x " + j + " = " + (k * j));
        }
    }
}
