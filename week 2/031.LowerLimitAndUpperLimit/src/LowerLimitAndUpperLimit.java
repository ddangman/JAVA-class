
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First");
        int x = Integer.parseInt(reader.nextLine());
        System.out.println("Last");
        int y = Integer.parseInt(reader.nextLine());
        while (x<=y) {
            System.out.println(x);
            x++;
        }
        // write your code here

    }
}
