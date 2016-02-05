
public class Main {

    public static void main(String[] args) {
        // use this main class to test your program!

        Container container = new Container(1000);
        Container a = new Container(1000);
        if (a.equals(container)) {
            System.out.println("yes");
        }        else {
            System.out.println("no");
        } 
        
        if (a.equalSize(container)) {
            System.out.println("yes");
        }        else {
            System.out.println("no");
        }
        int x = 123;
        double y = (double) x;
        System.out.println(y);

    }

    public static void addSuitcasesFullOfBricks(Container container) {
        // adding 100 suitcases with one brick in each
        for (int i = 1; i <= 100; i++) {
            Thing brick = new Thing("Brink", i);
        Suitcase suitcase = new Suitcase(100);
        suitcase.addThing(brick);
            container.addSuitcase(suitcase);
        }
    }

}
