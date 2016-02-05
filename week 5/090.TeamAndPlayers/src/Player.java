/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dang
 */
public class Player {

    private String playerName;
    private int goals;

    public Player(String name, int goals) {
        this.playerName = name;
        this.goals = goals;
    }

    public Player(String playerName) {
        this (playerName, 0);
    }

    public String getName() {
        return this.playerName;
    }

    public int goals() {
        return goals;
    }

    @Override
    public String toString() {
        return this.playerName + ", goals " + this.goals;
    }
}
