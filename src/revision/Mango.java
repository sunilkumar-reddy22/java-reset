package revision;
import java.util.Scanner;
public class Mango {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("\nenter a value: ");
            String fruit = input.next();
            switch (fruit) {
                case "Mango" -> System.out.println("Green raw fruit");
                case "Apple" -> System.out.println("Round tasteful fruit");
                case "banana" -> System.out.println("energy fruit");
                case "strawberry" -> System.out.println("red tiny good flavour fruit");
                default -> System.out.println("please enter a value input");
            }
            System.out.println("\nenter a number: ");
            int num = input.nextInt();
            switch (num) {
                case 1:
                    System.out.println("monday");
                    break;
                case 2:
                    System.out.println("tuesday");
                    break;
                case 3:
                    System.out.println("wednesday");
                    break;
                case 4:
                    System.out.println("thursday");
                    break;
                case 5:
                    System.out.println("friday");
                    break;
                case 6:
                    System.out.println("saturday");
                    break;
                case 7:
                    System.out.println("sunday");
                default:
                    System.out.println("invalid : error check again");
            }

        }
    }

}

