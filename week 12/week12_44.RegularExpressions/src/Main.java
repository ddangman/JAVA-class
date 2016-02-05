
public class Main {

    public static void main(String[] args) {
        // write test code here
        String text = "23:01:01";
        clockTime(text);
    }

    public static boolean isAWeekDay(String string) {
        if (string.matches("mon|tue|wed|thu|fri|sat|sun")) {
            System.out.println("The form is fine.");
            return true;
        }
        System.out.println("The form is wrong.");
        return false;
    }
    
    public static boolean allVowels(String string) {
        if (string.matches("(a|e|i|o|u|ä|ö)*")) {
            System.out.println("The form is fine.");
            return true;
        }
        System.out.println("The form is wrong.");
        return false;       
    }
    
    public static boolean clockTime(String string) {
        if (string.matches("([0-1][0-9]|20|21|22|23)(:[0-5][0-9]|60){2}")) {
            System.out.println("The form is fine.");
            return true;
        }
        System.out.println("The form is wrong.");
        return false;  
    }
}
