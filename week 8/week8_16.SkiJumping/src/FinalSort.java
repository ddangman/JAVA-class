
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dang
 */
public class FinalSort implements Comparator<Jumper>{
    @Override
    public int compare(Jumper a, Jumper b) {
        return b.getPoints() - a.getPoints();
    }
}
