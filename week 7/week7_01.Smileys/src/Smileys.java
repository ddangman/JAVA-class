
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }

    private static void printWithSmileys(String characterString) {
        if (characterString.length() % 2 == 1) {
            int length = characterString.length() + 7;
            smileyRow(length / 2);
            System.out.println(":) " + characterString + "  :)");
            smileyRow(length / 2);
        } else {
            int length = characterString.length() + 6;
            smileyRow(length / 2);
            System.out.println(":) " + characterString + " :)");
            smileyRow(length / 2);
        }

    }

    private static void smileyRow(int halfLength) {
        for (int i = 0; i < halfLength; i++) {
            System.out.print(":)");
        }
        System.out.println("");
    }
}
