
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dang
 */
public class Container {
    private int maxWeight;
    private ArrayList<Suitcase> cList;
    private int weightCount =0;
    
    public Container(int maxWeight) {
        this.maxWeight=maxWeight;
        this.cList= new ArrayList<Suitcase>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (weightCount+suitcase.totalWeight()<=maxWeight) {
            cList.add(suitcase);
            weightCount += suitcase.totalWeight();
        }        
    }
    
    public String toString() {
        return cList.size() + " suitcases (" + weightCount + " kg)";
    }
    
    public void printThings() {
        for (Suitcase each1 : cList) {
            each1.printThings();
        }
    }
    
    public boolean equalSize(Container object) {
        if (object == null) {
            return false;
        }

        if (this.maxWeight != object.maxWeight) {
            return false;
        }

        return true;
    }
    
}
