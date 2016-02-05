
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String x = reader.nextLine();
        System.out.println("Type your age: ");
        int y = Integer.parseInt(reader.nextLine());
        
        System.out.println(" ");
        System.out.println("Type your name: ");
        String z = reader.nextLine();
        System.out.println("Type your age: ");
        int a = Integer.parseInt(reader.nextLine());
        
        System.out.println(" ");
        System.out.println(x + " and " + z + " are " + (y+a) + " years old in total." );
    }
}
