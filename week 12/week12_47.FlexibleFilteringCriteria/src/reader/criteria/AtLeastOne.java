/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dang
 */
public class AtLeastOne implements Criterion{
    List<Criterion> criterias = new ArrayList<Criterion>();
    public AtLeastOne(Criterion... ind){
        for (Criterion each : ind) {
            criterias.add(each);
        }
    }

    @Override
    public boolean complies(String line) {
        for (Criterion each : criterias) {
            if (each.complies(line)) {
                return true;
            }            
        }       
        return false;
    }
    
}
