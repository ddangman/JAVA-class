
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dang
 */
public class PromissoryNote {
    private HashMap<String, Double> pn;
    public PromissoryNote() {
        this.pn = new HashMap<String, Double>();
        
    }
    
    public void setLoan(String toWhom, double value) {
        pn.put(toWhom, value);
        
    }
    
    public double howMuchIsTheDebt (String whose) {
        if (!pn.containsKey(whose)) {
            return 0;
        }        
        return pn.get(whose);
    }
}
