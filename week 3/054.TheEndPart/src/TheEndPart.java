import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word:");
        String x = reader.nextLine();
        System.out.println("Length of the end part:");
        int y = Integer.parseInt(reader.nextLine());
        System.out.println("Result: " + x.substring(x.length()-y, x.length()));
    }
}
