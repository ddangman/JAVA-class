/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author Dang
 */
public class MilkingRobot {
    private BulkTank connectedTank;
    
    public MilkingRobot() {
        this.connectedTank = null;
    }
    
    public void setBulkTank(BulkTank tank) {
        this.connectedTank = tank;
    }
    
    public BulkTank getBulkTank() {
        return connectedTank;
    }
    
    public void milk(Milkable milkable) {
        try {
            connectedTank.addToTank(milkable.milk());
            
        } catch (Exception e) {
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
            
        }
    }
    
}
