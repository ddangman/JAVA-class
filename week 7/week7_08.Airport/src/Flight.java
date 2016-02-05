/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dang
 */
public class Flight {
    private Plane plane;
    private String dest;
    private String dept;
    
    public Flight(Plane plane, String dept, String dest) {
        this.dept = dept;
        this.dest = dest;
        this.plane = plane;
    }
    
    @Override
    public String toString () {
        return plane.toString() + " (" + this.dept + "-" + this.dest + ")";
    }
}
