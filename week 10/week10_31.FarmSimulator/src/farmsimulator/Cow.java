/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Random;

/**
 *
 * @author Dang
 */
public class Cow implements Milkable, Alive{

    private String name;
    private double udderCapacity;
    private double amount;
    
    public Cow(String name) {
        this.name = name;
        this.udderCapacity = new Random().nextInt(26) + 15.0;
        this.amount = 0.0;
    }
    
    public Cow() {
        this(NAMES[new Random().nextInt(NAMES.length)]);   
    }
    
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    
    public String getName() {
        return name;
    }
    
    public double getCapacity() {
        return udderCapacity;
    }
    
    public double getAmount() {
        return this.amount;
    }

    @Override
    public double milk() {
        double milk = amount;
        amount = 0.0;
        return milk;
    }

    @Override
    public void liveHour() {
        double generate = (new Random().nextInt(14) + 7) / 10.0;
        this.amount += generate;
        if (this.amount> this.udderCapacity) {
            this.amount = this.udderCapacity;
        }        
    }
    
    @Override
    public String toString() {
        return this.name + " " + Math.ceil(this.amount) + "/" + this.udderCapacity;
    }
    
}
