public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int count1 = 0;
        while (count1 < amount) {
            System.out.print("*");
            count1 ++;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int count1 = 0;
        while (count1 < amount) {
            System.out.print(" ");
            count1 ++;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int x = 1;
        while (size !=0) {
            printWhitespaces(size - 1);
            printStars(x);
            size--;
            x++;
            
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int x = 1;
        int tab = height / 2;
        while (height != 0) {
            printWhitespaces(height -1);
            printStars(x +(x-1));
            height--;
            x++;
        }
        printWhitespaces(x-3);
        printStars(3);
        printWhitespaces(x-3);
        printStars(3);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
