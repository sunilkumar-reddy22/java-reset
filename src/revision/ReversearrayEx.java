package revision;
import java.util.Arrays;
public class ReversearrayEx {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        reverse(arr);
        int[] ans = arr;
        System.out.println(Arrays.toString((ans)));
    }
    static int []  reverse(int [] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = arr[temp];
            start++;
            end--;
        }
        return arr;
    }

}
