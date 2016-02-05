
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Scanner reader = new Scanner(System.in);
        BirdList bList = new BirdList();

        while (true) {
            System.out.println("Add - adds a bird");
            System.out.println("Observation - adds an observation");
            System.out.println("Statistics - prints all the birds");
            System.out.println("Show - prints one bird");
            System.out.println("Quit - terminates the program");
            String input = reader.nextLine().toLowerCase();
            if ("quit".equals(input)) {
                break;
            } //add
            else if ("add".equals(input)) {
                addBird(reader, bList);
            } //observation
            else if ("observation".equals(input)) {
                observe(reader, bList);
            }
            else if ("show".equals(input)) {
                show(reader, bList);
            }   
            else if ("statistics".equals(input)) {
                stats(bList);
            }            
        }

    }
    //start methods

    public static void addBird(Scanner reader, BirdList bList) {
        System.out.println("Name:");
        String birdName = reader.nextLine();
        System.out.println("Latin Name:");
        String latinName = reader.nextLine();
        bList.addBird(birdName, latinName);

    }

    public static void observe(Scanner reader, BirdList arg) {
        System.out.println("What was observed?");
        String birdName = reader.nextLine();
        for (Bird each : arg.getList()) {
            if (birdName.equals(each.getName())) {
                each.observation();
                System.out.println("Noted!");
            }            
            else {
                System.out.println("Is not a bird!");
            }            
        }
    }
    
    public static void show(Scanner reader, BirdList bList) {
        System.out.println("What?");
        String bname = reader.nextLine();
        for (Bird each : bList.getList()) {
            if (bname.equals(each.getName())) {
                System.out.println(each);
            }            
        }
    }
    
    public static void stats(BirdList bList) {
        for (Bird each : bList.getList()) {
            System.out.println(each);
        }
    }

}
