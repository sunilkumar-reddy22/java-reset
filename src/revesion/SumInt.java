package revesion;
import java.util.Scanner;
public class SumInt  {
    public static void main(String[] args) {
        System.out.println("enter a number: ");
        int sum = 0;
        long num = 1;
        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
            sum = sum + i;
            num = num * i;
        }
        System.out.println("sum = " + sum + " product = " + num);
    }
}
