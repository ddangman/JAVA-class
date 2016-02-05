
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
public class BirdList {

    private ArrayList<Bird> birdList;

    public BirdList() {
        this.birdList = new ArrayList<Bird>();
    }

    public void addBird(String name, String latinName) {
        birdList.add(new Bird(name, latinName));
    }
    
    public ArrayList<Bird> getList() {
        return this.birdList;
    }
}
