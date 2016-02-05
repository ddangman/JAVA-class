/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author Dang
 */
public class BulkTank {
    private double capacity;
    private double volume;
    
    public BulkTank() {
        this(2000);
    }
    
    public BulkTank(double capacity) {
        this.capacity = capacity;
        this.volume = 0;
    }
    
    public double getCapacity() {
        return this.capacity;
    }
    
    public double getVolume() {
        return this.volume;
    }
    
    public double howMuchFreeSpace() {
        return this.capacity-this.volume;
    }
    
    public void addToTank(double amount) {
        if (amount + volume > capacity) {
            volume = capacity;
        } else {
          volume +=amount;  
        }
               
    }
    
    public double getFromTank(double amount) {
        if (volume - amount >=0  && amount > 0 && volume > amount) {
            volume -= amount;
        } else if (amount > volume) {
            volume = 0;
        }        
        return volume;
    }
    
    public String toString() {
        return Math.ceil(volume) + "/" + Math.ceil(capacity);
    }
}
