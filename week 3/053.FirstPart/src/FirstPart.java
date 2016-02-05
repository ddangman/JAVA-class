
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word:");
        String x = reader.nextLine();
        System.out.println("Lenght of the first part:");
        int y = Integer.parseInt(reader.nextLine());
        System.out.println("Result: " + x.substring(0, y));
    }
}
