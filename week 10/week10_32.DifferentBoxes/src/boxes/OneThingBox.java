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
public class OneThingBox extends Box{
    private List<Thing> oneThing;
    
    public OneThingBox() {  
        this.oneThing = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        if (oneThing.isEmpty()) {
            oneThing.add(thing);
        }        
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if (oneThing.contains(thing)) {
            return true;
        }        
        return false;
    }
    
}
