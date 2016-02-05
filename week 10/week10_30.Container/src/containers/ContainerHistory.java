/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dang
 */
public class ContainerHistory {

    private List<Double> history;

    public ContainerHistory() {
        this.history = new ArrayList<Double>();
    }

    public void add(double situation) {
        history.add(situation);
    }

    public void reset() {
        history.clear();
    }

    public String toString() {
        return history.toString();
    }

    public double maxValue() {
        if (history.isEmpty()) {
            return 0;
        }
        double max = 0;
        for (double each : history) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }

    public double minValue() {
        double min = 0;
        if (history.isEmpty()) {
            return 0;
        } else {
            min = history.get(0);
            for (double each : history) {
                if (each < min) {
                    min = each;
                }
            }
        }
        return min;
    }

    public double average() {
        double addAll = 0;
        if (history.isEmpty()) {
            return 0;
        } else {
            for (double each : history) {
                addAll += each;
            }
        }
        double average = addAll / history.size();
        return average;
    }

    public double greatestFluctuation() {
        if (history.size() < 2) {
            return 0;
        } else {
            double maxFluctuation = 0;
            for (int i = 1; i < history.size(); i++) {
                double prev = history.get(i-1);
                double next = history.get(i);
                double diff = next - prev;
                if (abs(diff)> maxFluctuation) {
                    maxFluctuation = abs(diff);
                }                
                
            }
            return maxFluctuation;
        }
    }

    public double variance() {
        if (history.size() < 2) {
            return 0;
        }
        double sumVariance = 0;
        for (double each : history) {
            double diff = each - this.average();
            diff = Math.pow(diff, 2);
            sumVariance += diff;
        }
        double variance = sumVariance / (history.size() - 1);
        return variance;
    }
}
