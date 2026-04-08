package revision;
import java.util.Scanner;
public class TypecastingRevise{
    public static void main(String[] args) {
        System.out.println("Enter a character: ");
        Scanner letter  = new Scanner(System.in);
        char ch = letter.next().charAt(2);
        if(ch >= 'a'  && ch <= 'z'){
            System.out.println("lowercase");
        }
        else{
            System.out.println("uppercase");

        }
    }

}
