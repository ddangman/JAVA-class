/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dang
 */
public class MaxWeightBox extends Box {

    private final int maxWeight;
    private List<Thing> thingsList;
    private int weight;

    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        this.thingsList = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        if (weight + thing.getWeight() <= maxWeight) {
            thingsList.add(thing);
            weight += thing.getWeight();
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if (thingsList.contains(thing)) {
            return true;
        }
        return false;
    }

}
