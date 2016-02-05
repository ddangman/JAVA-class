
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dang
 */
public class Jumper implements Comparable<Jumper>{

    private final String jumper;
    private int points;
    private List<Integer> length;
    private int[] judgeVotes;
    private int roundJump;

    public Jumper(String jumper) {
        this.jumper = jumper;
        this.points = 0;
        this.length = new ArrayList<Integer>();
        this.judgeVotes = new int[5];
        this.roundJump = 0;
    }

    public void jumpOrder() {
        System.out.println(jumper + " (" + points + " points)");
    }

    public void roundGenerator() {
        ScoreGenerator sg = new ScoreGenerator();
        roundJump = sg.getDistance();
        length.add(roundJump);
        judgeVotes = sg.getVote();
        points += sg.getScore();
    }
    
    public void roundResult() {
        System.out.println("  " + jumper);
        System.out.println("    length: " + roundJump);
        System.out.println("    judge votes: " + Arrays.toString(judgeVotes));
    }
    
     public void resultLengths() {
        String print = "jump lengths: ";
         for (int i = 0; i <length.size(); i++) {
             print += Integer.toString(length.get(i)) + "m";
             if (i<length.size()-1) {
                 print += ", ";
             }             
         }
         System.out.println(print);
        
        
    }
    
    @Override
    public int compareTo(Jumper other) {
        return this.points - other.points;
    }
    
    public int getPoints() {
        return this.points;
    }
    
}
