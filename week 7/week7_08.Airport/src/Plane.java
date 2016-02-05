/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dang
 */
public class Plane {
    private String id;
    private String capacity;
    
    public Plane(String id, String cap) {
        this.capacity=cap;
        this.id=id;
    }
    
    
    public void setCap(String cap) {
        this.capacity = cap;
    }
    
    public String getPlane() {
        return this.id;
    }
    
    public String getCap() {
        return this.capacity;
    }
    
    public String toString() {
        return id + " (" + capacity + " ppl)";
    }
}
