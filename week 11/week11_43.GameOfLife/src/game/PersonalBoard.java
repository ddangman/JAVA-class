/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import gameoflife.GameOfLifeBoard;
import java.util.Random;

/**
 *
 * @author Dang
 */
public class PersonalBoard extends GameOfLifeBoard {

    public PersonalBoard(int width, int height) {
        super(width, height);
    }

    @Override
    public boolean isAlive(int x, int y) {
        if (x >= this.getWidth() || y >= this.getHeight() || x<0 || y<0) {
            return false;
        }
        return getBoard()[x][y];
    }

    @Override
    public void turnToLiving(int x, int y) {
        if (x > this.getWidth() || y > this.getHeight() || x<0 || y<0) {
            return;
        }
        getBoard()[x][y] = true;
    }

    @Override
    public void turnToDead(int x, int y) {
        if (x > this.getWidth() || y > this.getHeight() || x<0 || y<0) {
            return;
        }
        getBoard()[x][y] = false;
    }

    @Override
    public void initiateRandomCells(double probabilityForEachCell) {
        for (int x = 0; x < this.getWidth(); x++) {
            for (int y = 0; y < this.getHeight(); y++) {
                getBoard()[x][y] = false;
                if (new Random().nextDouble() < probabilityForEachCell) {
                    getBoard()[x][y] = true;
                }
            }
        }
    }

    @Override
    public int getNumberOfLivingNeighbours(int x, int y) {
        int count = 0;
        if (isAlive(x, y)) {
            count--;
        }        
        int xlow = inRangex(x - 1);
        int xhi = inRangex(x + 1);  
        int ylow = inRangey(y - 1);
        int yhi = inRangey(y + 1);
        for (int w = xlow; w <= xhi; w++) {
            for (int h = ylow; h <= yhi; h++) {
                if (isAlive(w, h)) {
                    count++;
                }
            }
        }
        return count;
    }

    @Override
    public void manageCell(int xin, int yin, int livingNeighbours) {
        int x = inRangex(xin);
        int y = inRangey(yin);
        if (livingNeighbours<2 && isAlive(x, y)) {
            turnToDead(x, y);
        } else if (isAlive(x, y) && livingNeighbours>3) {
            turnToDead(x, y);
        } else if (!isAlive(x, y) && livingNeighbours==3) {
            turnToLiving(x, y);
        }                      
    }
    
    //DON'T adjust bad values to fit. Discard them!!
    public int inRangex(int x) {
        int adjusted = x;
        if (adjusted>this.getWidth()) {
            adjusted = this.getWidth();
        } else if (adjusted<0) {
            adjusted = 0;
        }               
        return adjusted;
    }
    
    //DON'T adjust bad values to fit. Discard them!!
    public int inRangey(int y) {
        int adjusted = y;
        if (adjusted>this.getHeight()) {
            adjusted = this.getHeight();
        } else if (adjusted<0) {
            adjusted = 0;
        }               
        return adjusted;
    }
    
    /* Better code is to discard bad values
    public boolean isInsideTheBoard(int x, int y) {
        if (x >= getWidth() || x < 0) {
            return false;
        }
 
        if (y >= getHeight() || y < 0) {
            return false;
        }
 
        return true;
    }
    */
}
