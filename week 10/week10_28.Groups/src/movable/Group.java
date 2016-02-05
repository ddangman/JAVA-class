/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dang
 */
public class Group implements Movable{
    private List<Movable> organismList = new ArrayList<Movable>();
    
    @Override
    public String toString() {
        String toReturn = "";
        for (Movable each : organismList) {
            toReturn += each;
            toReturn += "\n";
        }
        return toReturn;
    }
    
    public void addToGroup(Movable movable) {
        organismList.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        for (Movable each : organismList) {
            each.move(dx, dy);
        }
    }
}
