import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class ProjectMini {

    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        Scanner vision = new Scanner(System.in);
        int x = vision.nextInt();
        int count = 0;
        while( x > 0) {
            int rem = x % 10;
            count++;
            x = x / 10;
        }
        System.out.println(count);
        System.out.println("Enter Number");
        int y = vision.nextInt();
        int result = 0;
        while(y > 0) {
            int rem = y % 10;
            result = result * 10 + rem;
            y = y / 10;
        }
        System.out.println(result);

    }
}
