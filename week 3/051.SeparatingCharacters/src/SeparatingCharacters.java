
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name:");
        String x = reader.nextLine();
        int y = 0;
        int z = 1;
        while (y != x.length()) {
            System.out.println(z + ". character: " + x.charAt(y));
            y++;
            z++;
        }
    }
}
