
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int x;
        int y = 0;
        System.out.println("Until what?");
        x = Integer.parseInt(reader.nextLine());
        while (y <=x) {
            sum +=y;
            y++;
        }
        System.out.println("Sum is " + sum);
    }
}
