
import java.util.Arrays;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dang
 */
public final class ScoreGenerator {

    private Random randomizer = new Random();
    private int distance;
    private int[] vote;
    private int score;


    public ScoreGenerator() {
        this.distance = makeDistance();
        this.vote = voteGenerator();
        this.score = calcScore();

    }
    
    private int[] voteGenerator() {
        int[] x = new int[5];
        for (int i = 0; i < 5; i++) {
            x[i] = randomizer.nextInt(11) + 10;
        }
        return x;
    }

    private int makeDistance() {
        return randomizer.nextInt(61) + 60;
    }
    
    public String toString() {
        return distance + " " + Arrays.toString(vote) + " " + this.score;
    }
    
    private int calcScore() {
        int x = distance;
        Arrays.sort(vote);
        for (int i = 1; i < 4; i++) {
            x += vote[i];
        }
        return x;
    }
    
    public int getDistance() {
        return this.distance;
    }
    
    public int getScore() {
        return this.score;
    }
    
    public int[] getVote() {
        return this.vote;
    }
            
    
    
    
   
}
