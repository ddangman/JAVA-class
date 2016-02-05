import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name:");
        String c = reader.nextLine();
        System.out.println("First character: " + firstCharacter(c.toUpperCase()));
    }
    public static char firstCharacter(String c){
        return c.charAt(0);
    }
            
}
