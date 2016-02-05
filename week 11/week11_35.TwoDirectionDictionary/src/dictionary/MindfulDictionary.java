/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Dang
 */
public class MindfulDictionary {

    private Map<String, String> dictionary = new HashMap<String, String>();
    private Map<String, String> translation = new HashMap<String, String>();
    private String file;

    public MindfulDictionary() {
    }

    public MindfulDictionary(String file) {
        this.file = file;
    }

    public void add(String word, String translation) {
        if (!dictionary.containsKey(word)) {
            this.dictionary.put(word, translation);
            this.translation.put(translation, word);
        }

    }

    public String translate(String word) {
        if (this.translation.containsKey(word)) {
            return translation.get(word);
        } else if (this.dictionary.containsKey(word)) {
            return dictionary.get(word);
        } else {
            return null;
        }
    }

    public void remove(String word) {
        String convert1 = translation.get(word);
        String convert2 = dictionary.get(word);
        translation.remove(word);
        translation.remove(convert1);
        translation.remove(convert2);
        dictionary.remove(word);
        dictionary.remove(convert1);
        dictionary.remove(convert2);
    }

    public boolean load() {
        try {
            Scanner reader = new Scanner(new File(this.file));
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] parts = line.split(":");

                this.add(parts[0], parts[1]);

            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean save() {
        try {
            FileWriter writer = new FileWriter(this.file);
            for (String each : dictionary.keySet()) {
                writer.write(each);
                writer.write(":");
                writer.write(dictionary.get(each));
                writer.write("\n");
            }
            writer.close();
            return true;

        } catch (Exception e) {
            return false;
        }
    }
}
