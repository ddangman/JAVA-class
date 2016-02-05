/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Rating;

/**
 *
 * @author Dang
 */
public class PersonalFilmComparator implements Comparator<Film>{
    private Map<Film, Rating> ratings;
    
    public PersonalFilmComparator(Map<Film, Rating> ratings) {
        this.ratings = ratings;
    }

    @Override
    public int compare(Film o1, Film o2) {
        double result = ratings.get(o2).getValue() - ratings.get(o2).getValue();
        if (result > 0) {
            return 1;
        } else if (result == 0) {
            return 0;
        } else {
            return -1;
        }
    }
    
}
