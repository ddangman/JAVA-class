
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
public class Run {

    private Scanner reader;
    private int roundCount;
    private List<Jumper> results;

    public Run() {
        reader = new Scanner(System.in);
        roundCount = 0;
        results = new ArrayList<Jumper>();
    }

    public void start() {

        hi();
        enterParticipants();
        tournament();
        System.out.println("Thanks!");
        printResults();
    }

    private void hi() {
        System.out.println("Kumpula ski jumping week\n"
                + "\n"
                + "Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
    }

    private String input(String prompt) {
        System.out.print(prompt);
        return reader.nextLine();
    }

    private void enterParticipants() {
        while (true) {
            String entry = input("  Participant name: ");
            if (entry.isEmpty()) {
                System.out.println("");
                System.out.println("The tournament begins!");
                System.out.println("");
                break;
            }
            results.add(new Jumper(entry));
        }
    }

    private void tournament() {
        while (true) {
            Collections.sort(results);
            String play = input("Write \"jump\" to jump; otherwise you quit: ");
            if (play.equals("jump")) {
                roundCount++;
                round();
                lineUp();
                roundResults();
            } else {
                break;
            }
        }
    }

    private void round() {
        System.out.println("Round " + roundCount);
        System.out.println("");
    }

    private void lineUp() {
        System.out.println("Jumping order:");
        int x = 1;
        for (Jumper each : results) {
            System.out.print("  " + x + ". ");
            each.jumpOrder();
            each.roundGenerator();
            x++;
        }
        System.out.println("");
    }

    private void roundResults() {
        System.out.println("Results of round " + roundCount);
        for (Jumper each : results) {
            each.roundResult();
        }
        System.out.println("");
    }

    private void printResults() {
        Collections.sort(results, new FinalSort());
        System.out.println("");
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        int x = 1;
        for (Jumper each : results) {
            System.out.print(x + "           ");
            each.jumpOrder();
            System.out.print("            ");
            each.resultLengths();
            System.out.println("");
            x++;
        }
    }

}
