
import java.util.ArrayList;

public class Variance {

    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int x = 0;
        for (int each : list) {
            x += each;
        }
        System.out.println(x);
        return x;
    }

    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double x = (double)sum(list) / (double)list.size();
        System.out.println(x);
        return x;
    }

    public static double variance(ArrayList<Integer> list) {
        double var = 0;
        double ave = average(list);
        double min1 = list.size() - 1.0;
        System.out.println(var);
        System.out.println(ave);
        System.out.println(min1);
        for (double each : list) {
            var += Math.pow((each - ave), 2.0);
        }
        return var/min1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The variance is: " + variance(list));
    }

}
