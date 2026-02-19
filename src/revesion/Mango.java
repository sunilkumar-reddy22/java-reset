package revesion;
import java.util.Scanner;
public class Mango {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("\nenter a value: ");
        String fruit = input.next();
            switch (fruit) {
                case "Mango":

                    System.out.println("Green raw fruit");
                    break;
                case "Apple":

                    System.out.println("Round tasteful fruit");
                    break;
                case "banana":

                    System.out.println("energy fruit");
                    break;
                case "strawberry":

                    System.out.println("red tiny good flavour fruit");
                    break;
                default:

                    System.out.println("please enter a value input");
            }
        }


    }
}
