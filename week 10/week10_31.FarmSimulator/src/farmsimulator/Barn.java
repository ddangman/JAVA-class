/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Collection;

/**
 *
 * @author Dang
 */
public class Barn {
    private BulkTank barnTank;
    private MilkingRobot installedRobot;
    
    public Barn(BulkTank tank) {
        this.barnTank = tank;
        this.installedRobot = null;
    }
    
    public BulkTank getBulkTank() {
        return barnTank;
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot) {
        installedRobot = milkingRobot;
    }
    
    public void takeCareOf(Cow cow) {
        try {
            barnTank.addToTank(cow.milk());
            
        } catch (Exception e) {
            throw new IllegalStateException("milking robot not installed");
        }
    }
    
    public void takeCareOf(Collection<Cow> cows) {
        try {
            for (Cow each : cows) {
                barnTank.addToTank(each.milk());            
            }
        } catch (Exception e) {
            throw new IllegalStateException("milking robot not installed");
        }
    }
    
    public String toString() {
        return barnTank.toString();
    }
    
}

