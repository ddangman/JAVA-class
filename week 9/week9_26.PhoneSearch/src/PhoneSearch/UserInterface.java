/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhoneSearch;

import Logic.Person;
import Logic.Service;
import java.util.Scanner;

/**
 *
 * @author Dang
 */
public class UserInterface {

    /**test codes
    String input = "1\n" + "duyj\n" + "209\n" + "1\n" + "duyj\n" + "916\n" + "4\n" + "duyj\n" + "123\n" + "evergreen terrace\n"
            + "7\n" + "d\n" + "1\n" + "jill\n" + "369\n" + "1\n" + "jill\n" + "852\n" + "5\n" + "jill\n" + "4\n" + "jen\n" + "city\n" + "hall\n" + "5\n" + "jen\n"
            + "5\n" + "joy\n" + "7\n" + "e\n" + "x";

    */
    Service callService = new Service();
    Scanner reader = new Scanner(System.in);

    public void initialize() {
        welcome();

        while (true) {
            String command = read("command: ");
            if ("x".equals(command)) {
                break;
            } else if (command.equals("1")) {
                addANumber();
            } else if (command.equals("2")) {
                searchNumber();
            } else if (command.equals("3")) {
                findPerson();
            } else if (command.equals("4")) {
                addAddress();
            } else if (command.equals("5")) {
                searchPersonalInfo();
            } else if (command.equals("6")) {
                delete();
            } else if (command.equals("7")) {
                filter();
            } else {
                System.out.println("not a valid command");
                commands();
            }
        }

    }

    private void addANumber() {
        String name = read("whose number: ");
        String number = read("number: ");
        callService.checkExistingPersonAndAdd(name);
        callService.addNumber(name, number);
    }

    private void searchNumber() {
        String name = read("whose number: ");
        if (!callService.checkNumber(name)) {
            System.out.println("  not found");
        } else {
            callService.printNumber(callService.returnPerson(name));
        }
    }

    private void findPerson() {
        String number = read("number: ");
        System.out.println(callService.findNameByNumber(number));
    }

    private void addAddress() {
        String who = read("whose address:");
        String street = read("street: ");
        String city = read("city: ");
        callService.addAdress(who, street, city);
    }

    private void searchPersonalInfo() {
        String who = read("whose information: ");
        if (callService.checkPerson(who)) {
            Person person = callService.returnPerson(who);
            if (!person.addressCheck()) {
                System.out.println("address unknown");
            }
            callService.printAddress(person);
            if (!person.numberCheck()) {
                System.out.println("  phone number not found");
            }
            callService.printNumber(person);
        } else {
            System.out.println("  not found");
        }
    }

    private void delete() {
        String who = read("whose information: ");
        callService.deletePerson(who);
    }

    private void filter() {
        String who = read("whose information: ");
        callService.keywordListBuilder(who);
    }

    private String read(String input) {
        System.out.print(input);
        String output = reader.nextLine();
        return output;
    }

    private void welcome() {
        System.out.println("phone search");
        System.out.println("available operations:");
        commands();
    }

    private void commands() {
        System.out.println(
                " 1 add a number\n"
                + " 2 search for a number\n"
                + " 3 search for a person by phone number\n"
                + " 4 add an address\n"
                + " 5 search for personal information\n"
                + " 6 delete personal information\n"
                + " 7 filtered listing\n"
                + " x quit");
    }

}
