/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dang
 */
public class Farm implements Alive{
    private String farmer;
    private Barn farmBarn;
    private List<Cow> cowRoster;
    
    public Farm(String farmer, Barn barn) {
        this.farmer = farmer;
        this.farmBarn = barn;
        this.cowRoster = new ArrayList<Cow>();
    }
    
    public String toString() {
        return "Farm owner: " + this.farmer + "\nBarn bulk tank: " + farmBarn.toString() + cowString();
    }
    
    private String cowString() {
        if (cowRoster.isEmpty()) {
            return "\nNo cows.";
        } 
        String returnCows = "\nAnimals:";
        for (Cow each : cowRoster) {
            returnCows += "\n        ";
            returnCows += each.toString();
        }
        return returnCows;
    }
    
    public String getOwner() {
        return farmer;
    }
    
    public void addCow(Cow cow) {
        cowRoster.add(cow);
    }

    @Override
    public void liveHour() {
        try {
            for (Cow each : cowRoster) {
                each.liveHour();
            }
        } catch (Exception e) {
            throw new IllegalStateException("no cows");
        }
    }
    
    public void manageCows() {
        farmBarn.takeCareOf(cowRoster);
    }
    
    public void installMilkingRobot(MilkingRobot robot) {
        farmBarn.installMilkingRobot(robot);
    }
    
}
