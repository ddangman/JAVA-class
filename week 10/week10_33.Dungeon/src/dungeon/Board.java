/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;


import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Dang
 */
public class Board {
    private Map<Integer, char[]> board;
    private int height;
    private int length;
    
    public Board(int length, int height) {
        this.height = height;
        this.length = length;
        this.board = new HashMap<Integer, char[]>();
        refreshBoard();
    }
    
    public void printBoard() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < height; i++) {
            sb.append(board.get(i));
            sb.append("\n");
        }
        System.out.println(sb);
        refreshBoard();
    }
    
    public void setPlayer (int x, int y) {
        board.get(y)[x] = '@';
    }
    
    public void setVampire (int x, int y) {
        board.get(y)[x] = 'v';
    }
    
    public void refreshBoard() {
        for (int i = 0; i < height; i++) {
            board.put(i, new char[length]);
            for (int j = 0; j < length; j++) {
                board.get(i)[j] = '.';
            }
        }
    }
    
}
