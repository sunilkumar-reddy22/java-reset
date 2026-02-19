package revesion;
import java.util.Scanner;
public class FabiNum2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         while(true) {
         System.out.println("enter a fabi num: ");
            int n = in.nextInt();
            int i = 0;
            int p = 1;
            int count = 2;
            while (count <= n) {
                int temp = p;
                p = p + i;
                i = temp;
                count++;
            }
            System.out.println(p);
        }
    }
}
