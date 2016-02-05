/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dang
 */
public class AverageSensor implements Sensor {

    private ArrayList<Sensor> ave;
    private ArrayList<Integer> reads;

    public AverageSensor() {
        this.ave = new ArrayList<Sensor>();
        this.reads = new ArrayList<Integer>();
    }
    
    public void addSensor(Sensor additional) {
        ave.add(additional);
    }
    
    @Override
    public boolean isOn() {
        for (Sensor each : ave) {
            if (!each.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        for (Sensor each : ave) {
            each.on();
        }
    }

    @Override
    public void off() {
        for (Sensor each : ave) {
            each.off();
        }
    }

    @Override
    public int measure() {
        if (!this.isOn()) {
            throw new IllegalArgumentException("Thermometer is off");
        }
        int math = 0;
        for (Sensor each : ave) {
            math += each.measure();
        }
        math /= ave.size();
        reads.add(math);        
        return math;
    }

    public List<Integer> readings() {
        return reads;
    }
    
}
