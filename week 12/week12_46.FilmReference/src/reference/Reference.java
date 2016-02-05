/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import reference.comparator.FilmComparator;
import reference.comparator.PersonalFilmComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author Dang
 */
public class Reference {

    private RatingRegister rr;
    private List<Film> filmList;

    public Reference(RatingRegister rr) {
        this.rr = rr;
        this.filmList = descendingFilmListFromMap(rr.filmRatings);
    }

    public Film recommendFilm(Person person) {
        if (!rr.personRatings.containsKey(person)) {
            return filmList.get(0);
        }
        Film recommend = null;
        Person myMatch = personMatch(person);
        List<Film> myMatchList = FilmListFromPerson(rr.getPersonalRatings(myMatch));
        List<Film> iveSeen= FilmListFromPerson(rr.getPersonalRatings(person));
        for (Film each : myMatchList) {
            if (!iveSeen.contains(each)) {
                recommend = each;
                break;
            } 
        }

        return recommend;
    }

    public List<Film> descendingFilmListFromMap(Map<Film, List<Rating>> mapIn) {
        List<Film> methodFilmList = new ArrayList<Film>();
        methodFilmList.addAll(mapIn.keySet());
        Collections.sort(methodFilmList, new FilmComparator(mapIn));
        return methodFilmList;
    }
    
    public List<Film> FilmListFromPerson(Map<Film, Rating> mapIn) {
        List<Film> methodFilmList = new ArrayList<Film>();
        for (Film each : mapIn.keySet()) {
            if (!mapIn.get(each).equals(Rating.NOT_WATCHED)) {
                methodFilmList.add(each);
            }            
        }

//methodFilmList.addAll(mapIn.keySet());
        Collections.sort(methodFilmList, new PersonalFilmComparator(mapIn));
        return methodFilmList;
    }

    public Person personMatch(Person me) {
        List<Person> personList = rr.reviewers();
        Person personMatch = personList.get(0);
        int matchPoints = 0;
        for (Person person : personList) {
            if (person.equals(me)) {
                continue;
            }            
            for (Film film : filmList) {
                if (rr.getRating(person, film).getValue() * rr.getRating(me, film).getValue() > matchPoints) {
                    matchPoints = rr.getRating(person, film).getValue() * rr.getRating(me, film).getValue();
                    personMatch = person;
                }
            }
        }
        return personMatch;
    }

}
