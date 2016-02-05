/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Dang
 */
public class Dungeon {
    
    private int moves;
    private boolean vampiresMoves;
    private Board board;
    private Set<Vampire> vampireList = new HashSet<Vampire>();
    private Player player = new Player(0, 0);
    private MoveLogic move;
    private Scanner reader = new Scanner(System.in);
    
    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove) {
        this.moves = moves;
        this.vampiresMoves = vampiresMove;
        this.board = new Board(length, height);
        while (vampireList.size() < vampires) {
            vampireList.add(new Vampire(new Random().nextInt(length), new Random().nextInt(height)));
            slay();
        }
        this.move = new MoveLogic(length, height);
        
    }
    
    public void run() {
        while (this.moves>0) {
            setCharacters();
            printStats();
            board.printBoard();
            moveInput();
            moves--;
            if (vampireList.isEmpty()) {
                break;
            }            
        }
        if (vampireList.isEmpty()) {
            System.out.println("YOU WIN");
        } else {
            System.out.println("YOU LOSE");
        }               
    }
    
    public void setCharacters() {
        board.setPlayer(player.getX(), player.getY());
        for (Vampire each : vampireList) {
            board.setVampire(each.getX(), each.getY());
        }
    }
    
    public void printStats() {
        System.out.println(moves);
        System.out.println("");
        System.out.println("@ " + player.getX() + " " + player.getY());
        for (Vampire each : vampireList) {
            System.out.println("v " + each.getX() + " " + each.getY());
        }
        System.out.println("");
    }
    
    public void slay() {
        Set<Vampire> slayed = new HashSet<Vampire>();
        for (Vampire each : vampireList) {
            if (each.getX() == player.getX() && each.getY() == player.getY()) {
                slayed.add(each);
            }
        }
        vampireList.removeAll(slayed);
    }
    
    public void moveInput() {
        char[] chars = reader.next().toCharArray();
        for (Character each : chars) {
            if (each.equals('a')) {
                move.moveLeft(player);
            } else if (each.equals('s')) {
                move.moveDown(player);
            } else if (each.equals('d')) {
                move.moveRight(player);
            } else if (each.equals('w')) {
                move.moveUp(player);
            } 
            slay();
            if (vampiresMoves) {
             for (Vampire vamp : vampireList) {
                move.moveVampire(vamp);
            } 
            slay(); 
            }            
            
        }
    }
    
}
