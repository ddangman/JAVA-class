
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How old are you?");
        int x = Integer.parseInt(reader.nextLine());
        if (x >= 0 && x < 121) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}
