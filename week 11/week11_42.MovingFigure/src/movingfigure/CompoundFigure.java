/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author Dang
 */
public class CompoundFigure extends Figure{
    private ArrayList<Figure> figureList = new ArrayList<Figure>();

    public CompoundFigure(int x, int y) {
        super(x, y);
    }
    public CompoundFigure() {
        this(0, 0);
    }

    @Override
    public void draw(Graphics graphics) {
        for (Figure each : figureList) {
            each.draw(graphics);
        }
    }
    
    public void add(Figure f) {
        figureList.add(f);
    }
    
    @Override
    public void move(int x, int y) {
        for (Figure each : figureList) {
            each.move(x, y);
        }
    }
    
}
