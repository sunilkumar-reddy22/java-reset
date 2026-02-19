package revesion;

public class Countplus {
    public static void main(String[] args) {
        int num = 23453;
        int count = 0;

        while(num > 0) {
            int rem = num % 10;  // After operation the last digit will be updated in rem;but og num reamins 23453
            if (rem == 3) {
                count++;
            }
            num = num / 10;   //to remove last digit and update num  for additional divisdn and for number check
        }
        System.out.println(count);

    }
}
