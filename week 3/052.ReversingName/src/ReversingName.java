import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name:");
        String x = reader.nextLine();
        int y = x.length();
        System.out.print("In reverse order: ");
        while (y>0) {
            System.out.print(x.charAt(y-1));
            y--;
        }
    }
}
