package revision;
import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        System.out.println("Enter a integer: ");
        Scanner d = new Scanner(System.in);
        int num = d.nextInt();
        int square = num * num;
        System.out.println("Square = " + square);
        Scanner input = new Scanner(System.in);
        int cube = input.nextInt();
        int cube3 = cube * cube * cube;
        System.out.println("Cube = " + cube3);
    }
}
