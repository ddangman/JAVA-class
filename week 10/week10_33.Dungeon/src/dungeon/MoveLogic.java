/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.Random;

/**
 *
 * @author Dang
 */
public class MoveLogic {
    private int xLimit;
    private int yLimit;
    private Random randomizer = new Random();
    
    public MoveLogic(int x, int y) {
        this.xLimit = x-1;
        this.yLimit = y-1;
    }
    
    public void moveUp(Characters c) {
        if (c.getY()>0) {
            c.moveVertical(c.getY()-1);
        }        
    }
    
    public void moveDown(Characters c) {
        if (c.getY()<yLimit) {
            c.moveVertical(c.getY()+1);
        }        
    }
    
    public void moveRight(Characters c) {
        if (c.getX()<xLimit) {
            c.moveHorizontal(c.getX()+1);
        }        
    }
    
    public void moveLeft(Characters c) {
        if (c.getX()>0) {
            c.moveHorizontal(c.getX()-1);
        }        
    }
    
    public void moveVampire(Characters c) {
        if (c.getY()==0) {
            notUp(c);
        } else if (c.getY()==yLimit) {
            notDown(c);
        } else if (c.getX()==0) {
            notLeft(c);
        } else if (c.getX()==xLimit) {
            notRight(c);
        } else {
            goAnywhere(c);
        }                                    
    }
    
    public void notUp(Characters c) {
        int choice = randomizer.nextInt(3);
        if (choice == 0) {
            moveDown(c);
        } else if (choice == 1) {
            moveLeft(c);
        } else if (choice == 2) {
            moveRight(c);
        }                      
    }
    
    public void notDown(Characters c) {
        int choice = randomizer.nextInt(3);
        if (choice == 0) {
            moveUp(c);
        } else if (choice == 1) {
            moveLeft(c);
        } else if (choice == 2) {
            moveRight(c);
        }                      
    }
    
    public void notLeft(Characters c) {
        int choice = randomizer.nextInt(3);
        if (choice == 0) {
            moveDown(c);
        } else if (choice == 1) {
            moveUp(c);
        } else if (choice == 2) {
            moveRight(c);
        }                      
    }
    
    public void notRight(Characters c) {
        int choice = randomizer.nextInt(3);
        if (choice == 0) {
            moveDown(c);
        } else if (choice == 1) {
            moveUp(c);
        } else if (choice == 2) {
            moveLeft(c);
        }                      
    }
    
    public void goAnywhere(Characters c) {
        int choice = randomizer.nextInt(4);
        if (choice == 0) {
            moveDown(c);
        } else if (choice == 1) {
            moveUp(c);
        } else if (choice == 2) {
            moveRight(c);
        } else if (choice ==3) {
            moveUp(c);
        }                             
    }
    
}
