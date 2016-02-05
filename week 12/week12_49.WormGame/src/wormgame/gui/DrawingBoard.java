/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.gui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import wormgame.domain.Piece;
import wormgame.game.WormGame;

/**
 *
 * @author Dang
 */
public class DrawingBoard extends JPanel implements Updatable{
    private WormGame wormGame;
    private int pieceLength;
    public DrawingBoard(WormGame wormGame, int pieceLength) {
        this.wormGame = wormGame;
        this.pieceLength = pieceLength;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Piece each : wormGame.getWorm().getPieces()) {
            g.setColor(Color.BLACK);
            g.fill3DRect(each.getX() * pieceLength, each.getY() * pieceLength, pieceLength, pieceLength, true);
        }
        g.setColor(Color.RED);
        g.fillOval(wormGame.getApple().getX() * pieceLength, wormGame.getApple().getY() * pieceLength, pieceLength, pieceLength);
    }

    @Override
    public void update() {
        this.repaint();
    }
    

}
