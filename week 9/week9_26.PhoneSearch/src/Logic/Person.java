/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Dang
 */
public class Person implements Comparable<Person>{
    private String name;
    private Set<String> numbers = new HashSet<String>();
    private String address = "";
    private String city = "";
    
    public Person (String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    
    public Set<String> getNumbers(){
        return numbers;
    }
    
    public void addNumber(String numberIn) {
        this.numbers.add(numberIn);
    }
    
    public void addAddress(String address, String city) {
        this.address=address;
        this.city=city;
    }
    
    public boolean addressCheck() {
        if (address.isEmpty() || city.isEmpty() || address == null || city == null) {
            return false;
        } 
        return true;
    }
    
    public boolean numberCheck() {
        if (numbers.isEmpty()) {
            return false;
        }        
        return true;
    }
    
    public String getAddress() {
        String returnAddress = this.address + " " + this.city;
        return returnAddress;
    }
    
    @Override
    public int compareTo(Person other) {
        return name.compareTo(other.name);
    }
}
