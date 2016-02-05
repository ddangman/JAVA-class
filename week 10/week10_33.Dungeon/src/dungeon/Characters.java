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
public class Characters {
    private int x;
    private int y;
    
    public Characters(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void moveVertical(int y) {
        this.y = y;
    }
    
    public void moveHorizontal(int x) {
        this.x = x;
    }
    
}
