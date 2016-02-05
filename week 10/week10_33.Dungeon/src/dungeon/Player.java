/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

/**
 *
 * @author Dang
 */
public class Player extends Characters{
    
    public Player(int x, int y) {
        super(x, y);
    }
    
    @Override
    public int hashCode() {
        return 10 * this.getX() + this.getY();
    }
    
}
