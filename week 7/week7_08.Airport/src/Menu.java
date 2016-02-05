
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dang
 */
public class Menu {

    ArrayList<Flight> flights;
    ArrayList<Plane> plane;
    Scanner scan;

    public Menu(Scanner scan) {
        this.flights = new ArrayList<Flight>();
        this.scan = scan;
        this.plane = new ArrayList<Plane>();
    }

    public void run() {
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println("");

        while (true) {
            System.out.println("Choose operation:\n"
                    + "[1] Add airplane\n"
                    + "[2] Add flight\n"
                    + "[x] Exit");
            String input = scan.nextLine();
            if ("x".equals(input)) {
                break;
            } else if ("1".equals(input)) {
                airPanel();
            } else if ("2".equals(input)) {
                flight();
            }

        }
        System.out.println("Flight service\n" +
"------------");

        while (true) {
            System.out.println("Choose operation:\n"
                    + "[1] Print planes\n"
                    + "[2] Print flights\n"
                    + "[3] Print plane info\n"
                    + "[x] Quit");
            String input = scan.nextLine();
            if ("x".equals(input)) {
                break;
            } else if ("1".equals(input)) {
                for (Plane each : plane) {
                    System.out.println(each);
                }
            } else if ("2".equals(input)) {
                for (Flight each : flights) {
                    System.out.println(each);
                }
            } else if ("3".equals(input)) {
                Plane find = getPlane();
                System.out.println(find);
            }

        }
    }

    public void airPanel() {
        String i = in("Give plane ID: ");
        String c = in("Give plane capacity:");
        plane.add(new Plane(i, c));

    }

    public void flight() {
        Plane a = getPlane();
        String b = in("Give departure airport code: ");
        String c = in("Give destination airport code: ");
        flights.add(new Flight(a, b, c));
    }

    public String in(String in) {
        System.out.println(in);
        return scan.nextLine();
    }

    public Plane getPlane() {
        String search = in("Give plane ID:");
        for (Plane each : plane) {
            if (search.equals(each.getPlane())) {
                return each;
            }
        }
        return null;
    }

}
