/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dang
 */
public class LyyraCard {

    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    @Override
    public String toString() {
        return "The card has " + this.balance + " euros";
    }

    public void payEconomical() {
        if (balance < 2.5) {
            
        } else {
            this.balance -= 2.50;
        }

    }

    public void payGourmet() {
        if (this.balance < 4) {
            
        } else {
            this.balance -= 4.00;
        }

    }

    public void loadMoney(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }

        if (this.balance > 150) {
            this.balance = 150;
        }
    }

}
