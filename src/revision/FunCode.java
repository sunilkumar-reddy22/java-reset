package revision;
import java.util.Scanner;
public class FunCode {
    public static void main(String[] args) {

    while (true) {
        int result0 = sum();
        if(result0 == 0) {
            System.out.println("stop");
            break;
        }
        System.out.println("Result = " + result0);
        int result1 = sum();
        System.out.println(result1);
        System.out.println("get back to main");
    }
    }
    static int sum() {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter first number:");
            int a = input.nextInt();
            if (a == 0) {
                System.out.println("Invalid input");
                return 0;
            }
            System.out.println("Enter second number");
            int b = input.nextInt();
            int result = a + b;
            //   System.out.println("sum =  " + sum );
            return result;
        }

    }

