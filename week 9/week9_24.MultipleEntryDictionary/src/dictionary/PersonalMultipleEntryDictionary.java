/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Dang
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary{
    private Map<String, Set<String>> StringSet;
    public PersonalMultipleEntryDictionary() {
        this.StringSet = new HashMap<String, Set<String>>();
    }
    

    @Override
    public void add(String word, String entry) {
        if (!this.StringSet.containsKey(word)) {
           StringSet.put(word, new HashSet<String>()); 
        }  
        
        Set<String> entries = this.StringSet.get(word);
        entries.add(entry);  
    }

    @Override
    public Set<String> translate(String word) {
        if (!this.StringSet.containsKey(word)) {
            return null;
        }
        return StringSet.get(word);      
    }

    @Override
    public void remove(String word) {
        StringSet.remove(word);
    }
    
}
