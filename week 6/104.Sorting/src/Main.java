
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        

    }

    public static int smallest(int[] small) {
        int x = 0;
        for (int i = 1; i < small.length; i++) {
            if (small[i]<small[x]) {
                x=i;
            }            
        }
        return small[x];
    }

    public static int indexOfTheSmallest(int[] inSmall) {
        int x = 0;
        for (int i = 1; i < inSmall.length; i++) {
            if (inSmall[i] < inSmall[x]) {
                x = i;
            }
        }
        return x;
    }

    public static int indexOfTheSmallestStartingFrom(int[] inSmall, int index) {
        int x = index;
        for (int i = index; i < inSmall.length; i++) {
            if (inSmall[i] < inSmall[x]) {
                x = i;
            }
        }
        return x;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int x = array[index1];
        int y = array[index2];
        array[index1]=y;
        array[index2]=x;
    }
    
    public static void sort (int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i]>array[j]) {
                    swap(array, i, j);
                    System.out.println(Arrays.toString(array));
                }                
            }
        }
    }
}
