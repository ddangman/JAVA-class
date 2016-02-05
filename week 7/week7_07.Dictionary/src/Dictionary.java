
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dang
 */
public class Dictionary {

    private final HashMap<String, String> eng;

    public Dictionary() {
        this.eng = new HashMap<String, String>();
    }

    public String translate(String word) {
        return eng.get(word);

    }

    public void add(String word, String translation) {
        eng.put(word, translation);
    }

    public int amountOfWords() {
        return eng.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> tList = new ArrayList<String>();
        for (String each : eng.keySet()) {
            tList.add( each + " = " + eng.get(each));
        }
        return tList;
    }

}
