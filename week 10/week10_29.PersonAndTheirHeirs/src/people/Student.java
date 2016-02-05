/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

/**
 *
 * @author Dang
 */
public class Student extends Person{
    private int credit;
    
    public Student(String name, String address) {
        super(name, address);
        this.credit = 0;
    }
    
    public void study() {
        credit++;
    }
    
    public int credits() {
        return credit;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n  credits " + credits();
    }
    
}
