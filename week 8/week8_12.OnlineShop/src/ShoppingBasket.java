
import java.util.ArrayList;
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
public class ShoppingBasket {

    private List<Purchase> sb = new ArrayList<Purchase>();

    public void add(String product, int price) {
        Purchase x = new Purchase(product, 1, price);
        if (!this.haveProduct(product)) {
          sb.add(x);   
        }        
    }

    public int price() {
        int z = 0;
        for (Purchase each : sb) {
            z += each.price();
        }
        return z;
    }

    public void print() {
        for (Purchase each : sb) {
            System.out.println(each.toString());
        }
    }
    
    public boolean haveProduct(String product) {
        for (Purchase each : sb) {
            if (each.getProduct().equals(product)) {
                each.increaseAmount();
                return true;
            }                     
        }
        return false;
    }
            
    
}
