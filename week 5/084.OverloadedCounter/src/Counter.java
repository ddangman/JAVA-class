/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dang
 */
public class Counter {

    private int count;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        //creates a new counter with the given value. The check is on if the parameter given to check was true.
        this.count = startingValue;
        this.check = check;
        
    }

    public Counter(int startingValue) {
        //creates a new counter with the given value. The check on the new counter should be off.
        this.count = startingValue;
        this.check = false;

    }

    public Counter(boolean check) {
        //creates a new counter with the starting value 0. The check is on if the parameter given to check was true.
        this.count = 0;
        this.check = check;
        this.check = true;

    }

    public Counter() {
        //creates a new counter with the starting value of 0 and with checking off.
        this.count = 0;
        this.check = false;

    }

    public int value() {
        //returns the current value of the counter
        return this.count;

    }

    public void increase() {
        //increases the value of the counter by one
        this.count++;
    }

    public void increase(int increaseAmount) {
        if (increaseAmount >= 0) {
            this.count += increaseAmount;
        }
    }

    public void decrease() {
        //decreases the value of the counter by one, but not below 0 if the check is on

        if (check && this.count <= 0) {
            return;
        }
        this.count--;
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount > this.count && check) {
            this.count = 0;
            
        }
        
        else if (check) {
            this.count-=decreaseAmount;
        } 
              
        else if (decreaseAmount >= 0 && check==false) {
            this.count -= decreaseAmount;
        }
    }

}
