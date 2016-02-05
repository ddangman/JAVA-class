/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dang
 */
public class Bird {

    private String name;
    private String Lname;
    private int obs;

    public Bird(String name, String Lname) {
        this.name = name;
        this.Lname = Lname;
        obs = 0;
    }

    public void observation() {
        obs++;
    }

    public String toString() {
        return name + " (" + Lname + "): " + obs + " observations";
    }
    
    public String getName() {
        return this.name;
    }
    
    public int observeNum() {
        return obs;
    }
}
