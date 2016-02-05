
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Words {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        while (true) {
            System.out.println("Type a word:");
            String x = reader.nextLine();
            if (x.isEmpty()) {
                break;
            } else {
                words.add(x);
            }                        
        }
        System.out.println("You typed the following words:");
        for (String each : words) {
            System.out.println(each);
        }
        
        

        
    }
    
}

