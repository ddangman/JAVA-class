
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
public class Box implements ToBeStored {

    private int count = 0;
    private double maxKg;
    private ArrayList<ToBeStored> list;

    public Box(double max) {
        this.maxKg = max;
        this.list = new ArrayList<ToBeStored>();
    }

    @Override
    public double weight() {
        double weight = 0;
        for (ToBeStored each : list) {
            weight += each.weight();
        }
        
        return weight;
    }

    public void add(ToBeStored item) {
        if (item.weight()+this.weight()<=maxKg) {
            list.add(item);
            count++;
        }        
    }

    public String toString() {
        return "Box: " + count + " things, total weight " + this.weight() + " kg";
    }

}
