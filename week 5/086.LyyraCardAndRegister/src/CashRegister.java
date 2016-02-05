
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        this.cashInRegister = 1000;
        this.economicalSold = economicalSold;
        this.gourmetSold = gourmetSold;
        // at start the register has 1000 euros 
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens        
        if (cashGiven>=2.5) {
            this.cashInRegister+=2.5;
            this.economicalSold++;
            cashGiven-=2.5;
            return cashGiven;
        }        
        return cashGiven;
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        if (cashGiven>=4) {
            this.cashInRegister+=4;
            this.gourmetSold++;
            cashGiven-=4;
            return cashGiven;
        }        
        return cashGiven;
    }


    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
    
     public boolean payEconomical(LyyraCard card) {
        // the price of the economical lunch is 2.50 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
         if (card.balance() >=2.5) {
         this.economicalSold++;
         card.pay(2.5);
             return true;
         }  else {
             
                         
         return false;
         }
    }

    public boolean payGourmet(LyyraCard card) {
        // the price of the gourmet lunch is 4.00 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        if (card.balance()>=4) {
            this.gourmetSold++;
            card.pay(4);
            return true;
        } else {       
        return false;
        }
    }
    
    public void loadMoneyToCard(LyyraCard card, double sum){
        if (sum>0) {
            card.loadMoney(sum);
            this.cashInRegister+=sum;
        }   
    }
    
}