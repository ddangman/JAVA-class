
import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int x = 0;
        int sum = 0;
        int counter = 0;
        int ocount = 0;
        int ecount = 0;
        while (x != -1) {  
            System.out.println("Type numbers:");
            x = Integer.parseInt(reader.nextLine());
            if (x == -1) {
                break;
            } else if (x % 2 == 0) {
                ecount++;
            } else if (x % 2 != 0) {
                ocount++;
            } 
            counter++;
            sum += x;

        }
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + counter);
        double cc = counter;
        System.out.println("Average: " + (sum / cc));
        System.out.println("Even numbers: " + ecount);
        System.out.println("Odd numbers: " + ocount);

    }
}
