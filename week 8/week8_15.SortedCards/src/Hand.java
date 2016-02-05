
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dang
 */
public class Hand implements Comparable<Hand>{
    private ArrayList<Card> hand = new ArrayList<Card>();
    
    
    public void add(Card card) {
        hand.add(card);
    }
    
    public void print() {
        for (Card each : hand) {
            System.out.println(each);
        }
    }
    
    public void sort() {
        Collections.sort(hand);
    }
    
    public int compareTo(Hand compare) {
        return this.addCards() - compare.addCards();
 
    }
    
    public int addCards() {
        int x = 0;
        for (Card each : hand) {
            x += each.getValue();
        }
        return x;
    }
    
    public void sortAgainstSuit() {
        Collections.sort(hand, new SortAgainstSuitAndValue());
    }
    
}
