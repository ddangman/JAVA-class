/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Dang
 */
public class Employees {
    private List<Person> people = new ArrayList<Person>();
    
    public Employees() {        
    }
    
    public void add(Person person) {
        people.add(person);
    }
    
    public void add(List<Person> persons) {
        for (Person each : persons) {
            people.add(each);
        }
    }
    
    public void print() {
        Iterator<Person> peopleI = people.iterator();
        while (peopleI.hasNext()) {
            System.out.println(peopleI.next());
        }
    }
    
    public void print(Education educate) {
        Iterator<Person> education = people.iterator();
        while (education.hasNext()) {
            Person p = education.next();
            if (p.getEducation()==educate) {
                System.out.println(p);
            }            
        }
    }
    
    public void fire(Education educate) {
        Iterator<Person> fire = people.iterator();
        while (fire.hasNext()) {
            Person p = fire.next();
            if (p.getEducation()==educate) {
                fire.remove();
            }            
        }
    }
    
}
