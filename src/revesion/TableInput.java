package revesion;
import java.util.Scanner;
public class TableInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n Enter a number: ");
        while (true) {
            int table = input.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(table + " x  " + i + " = " + (table * i));
            }
        }
    }
}
