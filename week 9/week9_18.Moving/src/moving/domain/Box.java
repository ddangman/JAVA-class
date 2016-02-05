/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dang
 */
public class Box implements Thing {

    private int maxCapacity;
    private List<Thing> listThing;

    public Box(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.listThing = new ArrayList<Thing>();

    }

    public boolean addThing(Thing thing) {
        if (thing.getVolume() + this.getVolume() <= maxCapacity) {
            listThing.add(thing);
            return true;
        }
        return false;
    }

    @Override
    public int getVolume() {
        int v = 0;
        for (Thing each : listThing) {
            v += each.getVolume();
        }
        return v;
    }

}
