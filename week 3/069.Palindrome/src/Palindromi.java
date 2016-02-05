import java.util.Scanner;

public class Palindromi {
        
    
    
    public static boolean palindrome(String text) {
        //reverses text to x
        String x = "";
        for (char each : text.toCharArray()) {
            x = each + x;
        }
        boolean check = x.equals(text);
        return check;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
