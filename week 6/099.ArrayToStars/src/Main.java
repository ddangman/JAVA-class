
public class Main {

    public static void main(String[] args) {
        // test the method here
        int[] array = {5, 1, 3, 0, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        // write code here
        for (int each : array) {
            for (int i = 1; i <=each; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
