
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a year:");
        int x = Integer.parseInt(reader.nextLine());
        if (x % 4 == 0 && x % 100 != 0 || x % 400 ==0  ) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}
