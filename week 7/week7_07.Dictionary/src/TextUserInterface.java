
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
public class TextUserInterface {

    private Scanner read;
    private Dictionary dict;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.read = reader;
        this.dict = dictionary;
    }

    public void start() {
        while (true) {
            System.out.println("Statement:\n"
                    + "  add - adds a word pair to the dictionary\n"
                    + "  translate - asks a word and prints its translation\n"
                    + "  quit - quits the text user interface");

            String x = read.nextLine().toLowerCase();
            if ("quit".equals(x)) {
                System.out.println("Cheers!");
                break;
            } else if ("add".equals(x)) {
                add(read);
            } else if ("translate".equals(x)) {
                translate(read);
            } else {
                System.out.println("Unknown statement");
            }
        }
    }

    public void add(Scanner name) {
        String fin = prompt("In Finnish");
        String eng = prompt("Translation:");
        dict.add(fin, eng);
    }

    public void translate(Scanner name) {
        String x = dict.translate(prompt("Give a word:"));
        System.out.println("Translation: " + x); 
    }

    public String prompt(String console) {
        System.out.println(console);
        return read.nextLine();
    }

}
