import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number");
        int x = Integer.parseInt(reader.nextLine());
        int fact = 1;
        while (x!=0) {
            fact *=x;
            x--;
        }
        System.out.println("Factorial is " + fact);
    }
}
