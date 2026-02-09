package revesion;
import java.util.Scanner;
public class FabiNum1 {
    public static void main(String[] args) {
        System.out.println("input a integer: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int n1 = 0;
        int n2 = 1;
        for(int i = 2; i <=num; i++) {
            int next = n1 + n2;
            System.out.println(next + " ");
            n1 = n2;
            n2 = next;
            int sum = n1 + n2;
            System.out.print(sum);
        }
    }

}
