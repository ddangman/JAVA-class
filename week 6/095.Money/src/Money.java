
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added){
    Money newMoney = new Money(added.euros+this.euros, added.cents+ this.cents);
    return newMoney;
    }
    
    public boolean less(Money compared){
        if (euros>compared.euros || (euros==compared.euros && cents>compared.cents)) {
            return false;
        }        
        return true;
    }
    
    public Money minus(Money decremented){
    int newCents = cents-decremented.cents;
    int newEuro = euros-decremented.euros;
        while (newCents<0) {
            newEuro--;
            newCents+=100;
        }
        if (newEuro<0) {
            newCents=0;
            newEuro=0;
        }        
    Money newMoney = new Money(newEuro, newCents);
       
    return newMoney;
    }

}
