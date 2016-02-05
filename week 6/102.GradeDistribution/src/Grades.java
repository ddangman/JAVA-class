
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
public class Grades {

    private ArrayList<Integer> scoreBook;
    private final Scanner scanner;
    private int[] distribution;
    private double accepted;
    private double allScores;

    public Grades() {
        this.scoreBook = new ArrayList<Integer>();
        this.scanner = new Scanner(System.in);
        this.distribution = new int[6];
        this.accepted = 0;
        this.allScores = 0;
    }

    public void takeScores() {
        System.out.println("Type exam scores, -1 completes:");
        while (true) {
            int holdScore = Integer.parseInt(scanner.nextLine());
            if (holdScore == -1) {
                break;
            }
            if (holdScore >= 0 && holdScore <= 60) {
                scoreBook.add(holdScore);
                allScores++;

            }

        }

    }

    public void makeDistribution() {
        for (int each : scoreBook) {
            if (each < 30) {
                distribution[0]++;
            } else if (each < 35) {
                distribution[1]++;
            } else if (each < 40) {
                distribution[2]++;
            } else if (each < 45) {
                distribution[3]++;
            } else if (each < 50) {
                distribution[4]++;
            } else if (each <= 60) {
                distribution[5]++;
            }
            if (each>=30) {
                accepted++;
            }            
        }
    }

    public void printDistribution() {
        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < distribution[i]; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("Acceptance percentage:" + (100 * accepted / allScores));
    }

}
