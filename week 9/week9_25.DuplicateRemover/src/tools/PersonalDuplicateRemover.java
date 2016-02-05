/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Dang
 */
public class PersonalDuplicateRemover implements DuplicateRemover{
    private Set<String> uniqueList;
    private int duplicateCount;
    public PersonalDuplicateRemover() {
        this.uniqueList=new HashSet<String>();
    }

    @Override
    public void add(String characterString) {
        if (uniqueList.contains(characterString)) {
            duplicateCount++;
        }
        uniqueList.add(characterString);
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return duplicateCount;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return uniqueList;
    }

    @Override
    public void empty() {
        duplicateCount=0;
        uniqueList.clear();
    }
    
}
