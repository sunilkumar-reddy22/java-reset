package revesion;
import java.util.Scanner;
import java.util.Random;
public class Appointment {
  static  Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter name:");
        String name = in.next();
        System.out.println("Enter Phone:");
        String phone = in.next();

        choosedepartment(name,phone);
    }
    static void choosedepartment(String name,String phone) {
        System.out.println("1.swimming");
        System.out.println("2.criket");
        System.out.println("3.boxing");
        System.out.println("4.mma");
        System.out.println("5.football");
        System.out.println("\nEnter choice");
        int choice = in.nextInt();
        switch (choice) {

            case 1:
                book(name, phone, "swimming");
                break;

            case 2:
                book(name, phone, "cricket");
                break;

            case 3:
                book(name, phone, "boxing");
                break;

            case 4:
                book(name, phone, "mma");
                break;

            case 5:
                book(name, phone, "football");
                break;
        }
    }
    static void book(String name,String phone,String book) {
    Random rand = new Random();
        int id  = rand.nextInt(9000) + 1000;
        System.out.println("name = " + name);
        System.out.println("phone = " + phone);
        System.out.println("book = " + book);
        System.out.println("id = " + id);


    }
}

