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
public class FilmComparator implements Comparator<Film>{
    private Map<Film, List<Rating>> ratings;
    
    public FilmComparator(Map<Film, List<Rating>> ratings) {
        this.ratings = ratings;
    }

    @Override
    public int compare(Film o1, Film o2) {
        double result = getAverage(o2) - getAverage(o1);
        if (result > 0) {
            return 1;
        } else if (result == 0) {
            return 0;
        } else {
            return -1;
        }
    }
    
    public double getAverage(Film f) {
        int size = ratings.get(f).size();
        int sum = 0;
        for (Rating each : ratings.get(f)) {
            sum+=each.getValue();
        }
        return sum * 100 / size;
    }
    
}
