package revision;

public class Mathtables1to20 {
    public static void main(String[] args) {
        for(int num = 1; num <= 20; num++) {
            System.out.println("Table of = " + num);

            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
            System.out.println();
        }

    }
}
