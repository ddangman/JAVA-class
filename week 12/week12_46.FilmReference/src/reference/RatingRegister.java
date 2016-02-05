/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author Dang
 */
public class RatingRegister {
    
    Map<Film, List<Rating>> filmRatings;
    Map<Person, Map<Film, Rating>> personRatings;
    
    public RatingRegister() {
        this.filmRatings = new HashMap<Film, List<Rating>>();
        this.personRatings = new HashMap<Person, Map<Film, Rating>>();
    }
    
    public void addRating(Film film, Rating rating) {
        if (!filmRatings.containsKey(film)) {
            filmRatings.put(film, new ArrayList<Rating>());
        }
        filmRatings.get(film).add(rating);
    }
    
    public void addRating(Person person, Film film, Rating rating) {
        addRating(film, rating);
        if (!personRatings.containsKey(person)) {
            personRatings.put(person, new HashMap<Film, Rating>());
        }
        if (!personRatings.get(person).containsKey(film)) {
            personRatings.get(person).put(film, rating);
        }
        
    }
    
    public List<Rating> getRatings(Film film) {
        return filmRatings.get(film);
    }
    
    public Rating getRating(Person person, Film film) {
        Map<Film, Rating> FilmRateByPerson = getPersonalRatings(person);
        if (FilmRateByPerson.get(film) == null) {
            return Rating.NOT_WATCHED;            
        }        
        return FilmRateByPerson.get(film);
        
    }
    
    public Map<Film, List<Rating>> filmRatings() {
        return this.filmRatings;
    }
    
    public Map<Film, Rating> getPersonalRatings(Person person) {
        if (personRatings.get(person)==null) {
            personRatings.put(person, new HashMap<Film, Rating>());
        }        
        return personRatings.get(person);
    }
    
    public List<Person> reviewers() {
        ArrayList<Person> returnReviewers = new ArrayList<Person>();
        returnReviewers.addAll(personRatings.keySet());
        return returnReviewers;
    }
}
