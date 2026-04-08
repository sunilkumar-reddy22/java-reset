package revision;

public class mathtables5to15 {
    public static void main(String[] args) {
        for (int num = 5; num <= 15; num++) {
            System.out.println("table of = " + num);

            for (int j = 1; j <= 10; j++) {
                System.out.println(num + " x " + j + " = " + (num * j));
            }
            System.out.println();
        }
    }
}