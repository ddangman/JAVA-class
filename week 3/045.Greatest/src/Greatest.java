
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {

        int x;
        if (number1>= number2) {
            x = number1;
        } else {
          x = number2;  
        }
        if (x >= number3) {
            return x;
        } else {
            return number3;
        }
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}