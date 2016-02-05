/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.domain;

import java.util.List;
import java.util.ArrayList;
import wormgame.Direction;

/**
 *
 * @author DANG
 */
public class Worm {

    private boolean growthSwitch;
    private Direction direction;
    private List<Piece> pieces;
    private int x;
    private int y;

    public Worm(int originalX, int originalY, Direction originalDirection) {
        this.x = originalX;
        this.y = originalY;
        this.direction = originalDirection;
        this.pieces = new ArrayList<Piece>();
        pieces.add(new Piece(originalX, originalY));
    }

    public Direction getDirection() {
        return this.direction;
    }

    public void setDirection(Direction dir) {
        this.direction = dir;
    }

    public int getLength() {
        return pieces.size();
    }

    public List<Piece> getPieces() {
        return this.pieces;
    }

    public void grow() {
        growthSwitch = true;
    }

    public void move() {
        if (direction == Direction.DOWN) {
            y++;
        } else if (direction == Direction.UP) {
            y--;
        } else if (direction == Direction.LEFT) {
            x--;
        } else if (direction == Direction.RIGHT) {
            x++;
        }
        pieces.add(new Piece(x, y));
        cutTail();
    }
    
    private void cutTail() {
        if (pieces.size()<=3) {
            growthSwitch = true;
        }        
        if (!growthSwitch) {
            pieces.remove(0);
        }        
        growthSwitch = false;
    }

    public boolean runsInto(Piece piece) {
        for (Piece p : pieces) {
            if (p != piece) {
                if (p.runsInto(piece)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean runsIntoItself() {
        for (int i = 0; i < pieces.size()-1; i++) {
            if (runsInto(pieces.get(i))) {
                return true;
            }
        }
        return false;
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
}
