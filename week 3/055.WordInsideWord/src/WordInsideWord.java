
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first word:");
        String x = reader.nextLine();
        System.out.println("Type the second word");
        String y = reader.nextLine();
        if (x.indexOf(y) == -1) {
            System.out.println("The word '" + y + "' is not found in the word '" + x + "'.");
        } else {
            System.out.println("The word '" + y + "' is found in the word '" + x + "'.");
        }
    }
}
