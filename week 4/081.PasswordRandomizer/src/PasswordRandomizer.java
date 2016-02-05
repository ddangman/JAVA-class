import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int length;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        int counter = this.length;
        String pwhold = "";
        while (counter > 0) {
            Random digit = new Random();
            pwhold += "abcdefghijklmnopqrstuvwxyz".charAt(digit.nextInt(26));
            counter--;
        }
        return pwhold;
    }
}
