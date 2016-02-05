

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dang
 */
public class RingingCentre {

    private Map<Bird, List<String>> rc = new HashMap<Bird, List<String>>();

    public void observe(Bird bird, String place) {
        if (!this.rc.containsKey(bird)) {
           rc.put(bird, new ArrayList<String>()); 
        }        
        rc.get(bird).add(place);
    }

    public void observations(Bird bird) {
        System.out.print(bird + " observations: ");
        if (rc.get(bird) == null) {
            System.out.println("0");
        } else {
            System.out.println(rc.get(bird).size());
            for (String each : rc.get(bird)) {
                System.out.println(each);
            }
        }               
        
    }

}
