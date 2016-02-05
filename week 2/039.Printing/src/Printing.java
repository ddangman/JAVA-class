
public class Printing {

    public static void printStars(int amount) {
        // 39.1
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times
        int count1 = 0;
        while (count1 < amount) {
            System.out.print("*");
            count1 ++;
        }
        System.out.println("");

    }

    public static void printSquare(int sideSize) {
        // 39.2
        int count2 = 0;
        while (count2 < sideSize) {
            printStars(sideSize);
            count2 ++;
        }
    }

    public static void printRectangle(int width, int height) {
        // 39.3
        int count3 = 0;
        while (count3 < height) {
            printStars(width);
            count3 ++;
        }
    }

    public static void printTriangle(int size) {
        // 39.4
        int x = 1;
        while (x <= size) {
            printStars(x);
            x ++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        // testing
        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
