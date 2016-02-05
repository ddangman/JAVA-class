package wormgame.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import wormgame.Direction;
import wormgame.domain.Apple;
import wormgame.domain.Worm;
import wormgame.gui.Updatable;

public class WormGame extends Timer implements ActionListener {

    private int width;
    private int height;
    private boolean continues;
    private Updatable updatable;
    private Worm worm;
    private Apple apple;

    public WormGame(int width, int height) {
        super(1000, null);

        this.width = width;
        this.height = height;
        this.continues = true;

        addActionListener(this);
        setInitialDelay(2000);

        worm = new Worm(width / 2, height / 2, Direction.DOWN);
        while (true) {
            this.apple = newApple();
            if (!worm.runsInto(apple)) {
                break;
            }            
        }
    }


    public boolean continues() {
        return continues;
    }

    public void setUpdatable(Updatable updatable) {
        this.updatable = updatable;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!continues) {
            return;
        }
        worm.move();
        if (worm.runsInto(apple)) {
            apple = newApple();
            worm.grow();
        } 
        if (worm.runsIntoItself() ||
                worm.getX() < 0 ||
                worm.getX() > width -1 ||
                worm.getY() < 0 ||
                worm.getY() > height -1) {
            continues = false;
        }        
        updatable.update();
        setDelay(1000 / worm.getLength());
    }
    
    public Worm getWorm() {
        return this.worm;
    }
    
    public void setWorm(Worm worm) {
        this.worm = worm;
    }
    
    public Apple getApple() {
        return this.apple;
    }
    
    public void setApple(Apple apple) {
        this.apple = apple;
    }
    
    public final Apple newApple() {
        return new Apple(new Random().nextInt(width), new Random().nextInt(height));
    }

}
