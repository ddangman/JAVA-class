
import java.util.ArrayList;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dang
 */
public class Suitcase {

    private final int maxKg;
    private final ArrayList<Thing> classCase;

    public Suitcase(int maxKg) {
        this.maxKg = maxKg;
        this.classCase = new ArrayList<Thing>();

    }

    public void addThing(Thing thing) {
        int weightCount = 0;
        for (Thing each : classCase) {
            weightCount += each.getWeight();
        }
        if ((weightCount + thing.getWeight()) <= maxKg) {
            classCase.add(thing);
            weightCount += thing.getWeight();
        }
    }

    @Override
    public String toString() {
        int weightCount = 0;
        int itemCount = classCase.size();
        for (Thing each : classCase) {
            weightCount += each.getWeight();
        }
        if (itemCount == 0) {
            return "empty (0 kg)";
        } else if (itemCount == 1) {
            return itemCount + " thing (" + weightCount + " kg)";
        }
        return itemCount + " things (" + weightCount + " kg)";
    }

    public void printThings() {
        for (Thing each : classCase) {
            System.out.println(each);
        }
    }

    public int totalWeight() {
        int weightCount = 0;
        for (Thing each : classCase) {
            weightCount += each.getWeight();
        }
        return weightCount;
    }

    public Thing heaviestThing() {
        if (classCase.isEmpty()) {
            return null;
        }
        Thing heaviest = classCase.get(0);
        for (Thing each : classCase) {
            if (each.getWeight() > heaviest.getWeight()) {
                heaviest = each;
            }
        }
        return heaviest;
    }

}
