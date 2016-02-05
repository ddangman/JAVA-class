/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author Dang
 */
public class Thermometer implements Sensor {
    private Random randomizer;
    private int sense;

    public Thermometer() {
        this.sense = 0;
        this.randomizer = new Random();
    }
    
    @Override
    public boolean isOn() {
        if (sense ==1) {
            return true;
        }        
        return false;
    }

    @Override
    public void on() {
        sense =1;
    }

    @Override
    public void off() {
        sense =0;
    }

    @Override
    public int measure() {
        if (sense ==1) {
            return randomizer.nextInt(61)-30;
        }
        else {
            throw new IllegalArgumentException("Thermometer is off");
        }        
    }

}
