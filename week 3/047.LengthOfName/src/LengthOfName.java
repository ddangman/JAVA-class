
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // call your method from here
        System.out.println("Type your name:");
        String cc = reader.nextLine();
        int count = calculateCharacters(cc);
        System.out.println("Number of characters: " + count);
    }
    
    // do here the method
    // public static int calculateCharacters(String text)
    public static int calculateCharacters(String cc) {
       return cc.length();
    }
    
}
