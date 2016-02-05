/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import moving.domain.Box;
import moving.domain.Thing;

/**
 *
 * @author Dang
 */
public class Packer {

    private int boxesVolume;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things) {
        List<Box> boxList = new ArrayList<Box>();
        boxList.add(new Box(boxesVolume));
        for (Thing each : things) {
            if (boxList.get(boxList.size() - 1).getVolume() + each.getVolume()>boxesVolume) {
                boxList.add(new Box(boxesVolume));
            }
            boxList.get(boxList.size() - 1).addThing(each);
        }
        return boxList;
    }

}
