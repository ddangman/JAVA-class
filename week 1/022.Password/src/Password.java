
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        String x = " ";
        while (!x.equals("carrot")) {
            System.out.println("Type the password:");
            x = reader.nextLine();
            if (x.equals("carrot")) {
                break;
            } 
            System.out.println("Wrong!");
        }
        System.out.println("Right!");
        System.out.println("The secret is: well done!");
        // Write your code here
    }
}
