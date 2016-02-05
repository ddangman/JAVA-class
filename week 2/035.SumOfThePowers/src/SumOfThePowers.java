
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number:");
        int x = Integer.parseInt(reader.nextLine());
        int y = 0;
        int sum = 0;
        while (y<=x) {
            sum += Math.pow(2, y);
            y++;
        }
        System.out.println("The result is " + sum);
    }
}
