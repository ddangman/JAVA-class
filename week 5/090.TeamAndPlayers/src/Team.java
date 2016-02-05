
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dang
 */
public class Team {

    private String teamName;
    private ArrayList<Player> playerList = new ArrayList<Player>();
    private int maxSize;

    public Team(String teamName) {
        this.teamName = teamName;
        this.maxSize = 16;

    }

    public String getName() {
        return this.teamName;
    }

    public void addPlayer(Player playerName) {
        if (playerList.size()<this.maxSize) {
            playerList.add(playerName);
        }        
        

    }

    public void printPlayers() {
        for (Player each : playerList) {
            System.out.println(each);
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
    
    public int size(){
    return playerList.size();
    }
    
    public int goals(){
        int allGoals=0;
        for (Player each : playerList) {
            allGoals+= each.goals();
        }
        
    return allGoals; 
    }

}
