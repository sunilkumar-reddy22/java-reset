package revesion;
import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        for (int i = 1; i <= 5 ;i ++) {
            System.out.println(i);
        }
        System.out.println("enter a number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int count = 0;
        int sum = 0;
        while(count < num) {
            count++;
            System.out.print(count + " ");
            sum = sum + count;
        }
        System.out.println("sum = " + sum);
    }
}
