
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        while (true) {
            System.out.println("Add a number -30: 40");
            double x = Double.parseDouble(reader.nextLine());
            if (x >= -30 && x <= 40) {
                Graph.addNumber(x);
            } else {
                System.out.println("Out of range");
                break; //remove break to get credit
                      
            }
        }
        // Graph is used as follows:
//        Graph.addNumber(7);
//        double value = 13.5;
//        Graph.addNumber(value);
//        value = 3;
//        Graph.addNumber(value);
        // Remove or comment out these lines above before trying to run the tests.
    }
}