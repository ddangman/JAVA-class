
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        while (true) {
            System.out.println("name:");
            String x = reader.nextLine();
            if (x.isEmpty()) {
                for (Student each : list) {
                    System.out.println(each);
                }
                System.out.println("Give search term:");
                String z = reader.nextLine();
                System.out.println("Result");
                for (Student each : list) {
                    if (each.getName().contains(z)) {
                        System.out.println(each);
                    }                    
                }
                break;
            }
            System.out.println("studentnumber:");
            String y = reader.nextLine();
            list.add(new Student(x, y));
        }

    }
}
