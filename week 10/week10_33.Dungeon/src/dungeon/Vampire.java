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
public class Vampire extends Characters{
  
    public Vampire(int x, int y) {
        super(x, y);
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass()!=o.getClass()) {
            return false;
        } 
        
        Vampire v = (Vampire) o;
        
        if (this.getX()==v.getX() && this.getY()==v.getY()) {
            return true;
        } 
        return false;
    }

    @Override
    public int hashCode() {
        return 10 * this.getX() + this.getY();
    }
  
}
